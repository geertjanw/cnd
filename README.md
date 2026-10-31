# NetBeans C/C++ (CND) Support — Restoration for Apache NetBeans 31

This repository contains the **full C/C++ development modules ("CND") from
NetBeans 8.2**, restored and made to build against **Apache NetBeans 31** and
**JDK 21**.

These modules were part of NetBeans before Oracle donated the project to the
Apache Software Foundation. They were **not** part of that donation and are
therefore absent from Apache NetBeans. This repository brings them back so they
can be built and run on a current NetBeans platform.

> ⚠️ This is an independent, unofficial restoration. It is **not** affiliated
> with, endorsed by, or supported by Oracle, the Apache Software Foundation, or
> the Apache NetBeans project. See [Ownership & License](#ownership--license).

> 💡 **Need Apache-2.0 licensing instead?** A sibling project,
> [**`geertjanw/cnd-apache`**](https://github.com/geertjanw/cnd-apache), packages
> the *subset* of CND that Oracle actually **donated** to the ASF and that
> was **relicensed to Apache 2.0** — built from the official
> [`apache/netbeans@cnd`](https://github.com/apache/netbeans/tree/cnd) branch. It
> has fewer modules (no native code model, so C/C++ intelligence is delegated to
> `clangd` over LSP) but it is Apache-licensed and can be redistributed
> or contributed toward Apache NetBeans. See
> [Relationship to Apache NetBeans](#relationship-to-apache-netbeans) for how the
> two repositories compare.

---

## Ownership & License

**The code in this repository is not mine and I do not claim ownership of it.**
Essentially all source under `cnd/`, `cndext/`, and `dlight/` is pre-existing,
copyrighted work:

| Copyright holder | Years (per file headers) |
|------------------|--------------------------|
| Sun Microsystems, Inc. | 1997–2007 |
| Oracle and/or its affiliates | 2007–2016 |

Every source file retains its **original copyright header** and the following
dual-license grant, unchanged:

> *The contents of this file are subject to the terms of either the GNU General
> Public License Version 2 only ("GPL") or the Common Development and
> Distribution License ("CDDL")* … with Oracle's **"Classpath" exception**.

→ License: **`CDDL-1.0 OR GPL-2.0-only WITH Classpath-exception-2.0`**
(recipient's choice). Full text: [`LICENSE`](LICENSE).

The only original contribution here is the set of **modifications** required to
compile and run the 8.2 code on NetBeans 31 / JDK 21 (see
[Modifications](#modifications-made)). Those modifications are released under the
**same CDDL/GPL dual license** as the files they modify.

### What you may do

- ✅ Use, build, run, copy, modify, and **redistribute** these modules, under
  **CDDL and/or GPL** (your choice, per the dual grant).

### What you must do

- 📌 **Keep every copyright notice and license header intact** — the headers
  state *"DO NOT ALTER OR REMOVE COPYRIGHT NOTICES."*
- 📌 **Include [`LICENSE`](LICENSE)** with any redistribution.
- 📌 **Keep modified CDDL files under CDDL** (CDDL is file-level copyleft).
- 📌 If distributing under **GPL**, make corresponding source available.

### What you may not do

- ❌ Relicense the Oracle/Sun files under Apache-2.0, MIT, or your own license.
- ❌ Claim authorship of the recovered code.
- ❌ Use the **"NetBeans", "Oracle", or "Java"** trademarks to imply this is an
  official Oracle or Apache product. These are trademarks of their respective
  owners; their use here is nominal (to describe the code), not an endorsement.

---

## Contents

| Path | Modules | Description |
|------|---------|-------------|
| `cnd/` | 86 source trees | C/C++ editor, make projects, debugger, code model, remote, discovery, … |
| `cndext/` | `cnd.mixeddev` | C/C++ ↔ Java JNI bridge (JNI header generation, Java `native` → C++ navigation) |
| `dlight/` | 13 source trees | Native execution, remote filesystem, terminal/PTY |

**Excluded on purpose:** `cnd.debugger.dbx` and `libs.dbx.support` — proprietary
Solaris `dbx` support that was never open-sourced.

**Not committed** (regenerated/downloaded at build time): module `build/` output,
and the ANTLR 3.4 build-time toolchain (`cnd/.antlr3-tool/`, BSD-licensed; see
[Building](#building)).

---

## Modifications made

All under CDDL/GPLv2-CP. Build/compatibility fixes only — no feature changes:

- **Layout** — module `build.xml` imports and `<project name>` values adjusted
  for the Apache grouped layout (`group/module/`) vs. the flat 8.2 layout.
- **JDK 21** — `javac.source`/`target` bumped from 1.5/1.6/1.7 to 1.8+;
  `--add-exports` added for `dlight.remote.ui` (`sun.awt.shell`, `sun.swing`);
  a stale `-target 1.5` removed.
- **Platform drift** — `cnd.indexing` dependency on `parsing.lucene` updated to
  the current release/spec; `java.api.common` dependency added to `cnd.mixeddev`
  (a method moved to a superinterface).
- **ANTLR** — `cnd.modelimpl` ANTLR 3 code generation repointed at a downloaded
  ANTLR 3.4 toolchain (the original `libs.antlr3.devel` module was never donated
  to Apache).
- **Dependency pruning** — dead remote-VCS dependencies removed from `dlight.kit`
  and `cnd.kit`.

---

## Building

These are additional **clusters** layered on an Apache NetBeans source build.

1. Clone Apache NetBeans 31 and copy these three directories into the checkout:
   ```
   git clone --branch 31 https://github.com/apache/netbeans.git
   cp -r cnd cndext dlight netbeans/
   ```
2. Apply the cluster wiring in `nbbuild/cluster.properties` — see
   [`docs/cluster.properties.patch`](docs/cluster.properties.patch). It declares
   the `cnd`/`cndext`/`dlight` clusters and the trimmed module lists.
3. Provide the ANTLR 3.4 build-time toolchain in `cnd/.antlr3-tool/`
   (BSD-licensed, from Maven Central): `antlr-3.4.jar`, `antlr-runtime-3.4.jar`,
   `antlr-2.7.7.jar`, `stringtemplate-3.2.1.jar`, `ST4-4.0.4.jar`.
4. Build (JDK 21, Apache Ant 1.10+):
   ```
   cd netbeans
   ant -Dcluster.config=cnd build-nozip      # platform + ide + cnd + dlight
   ant -Dcluster.config=cndext build-nozip   # the above + Java + cnd.mixeddev
   ```
5. Run: `nbbuild/netbeans/bin/netbeans`

---

## Usage

A good end-to-end exercise of this plugin is the **DuckDB JDBC driver**,
[`duckdb/duckdb-java`](https://github.com/duckdb/duckdb-java) — a mixed
project: a **C++ JNI native library** plus a **Java JDBC API**, built with CMake
and a `Makefile`. The steps below are exactly the workflow we used.

### 1. Open the native (C/C++) side as a make project

`duckdb-java` builds with `make`/CMake, so open it as a CND **make project**:

- *File → Open Project* on the checkout if it already contains `nbproject/`
  (CND make-project metadata), **or**
- *File → New Project → C/C++ → C/C++ Project with Existing Sources*, point it at
  the checkout, and let the wizard detect the `Makefile`.

NetBeans then parses the native sources under `src/jni/*.cpp` into the C/C++ code
model (give the parse a moment to finish — progress shows bottom-right).

### 2. Build the native library + driver jar

`duckdb-java`'s `Makefile` default target is `test`, **not** a build — running a
bare `make` fails because nothing is compiled yet. Build first:

```
make release     # CMake-builds the JNI native lib + the JDBC jar
make test        # runs the test harness against the built jar
```

`make release` produces `build/release/duckdb_jdbc.jar`, which bundles the
compiled native library (e.g. `libduckdb_java.so_osx_universal` on macOS).
Prerequisites on macOS: CMake and the Xcode command-line tools. You can run these
targets from the CND make project (which executes them through the integrated
terminal), or from a shell.

### 3. Get Java resolution alongside the C/C++ project

A CND make project indexes **C/C++ only** — it does not register Java source
roots, so `import static org.duckdb.DuckDBBindings.*;` (and every other Java
symbol) shows unresolved. Add a lightweight **Maven project** that points at the
existing Java sources. `duckdb-java` already uses the Maven-standard layout
(`src/main/java`, `src/test/java`), so the POM is tiny — drop it in a subfolder
(e.g. `nb-java/pom.xml`) so it does not collide with the CND `nbproject/`:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0">
    <modelVersion>4.0.0</modelVersion>
    <groupId>org.duckdb</groupId>
    <artifactId>duckdb-java-sources</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    <properties>
        <maven.compiler.release>11</maven.compiler.release>
    </properties>
    <build>
        <sourceDirectory>../src/main/java</sourceDirectory>
        <testSourceDirectory>../src/test/java</testSourceDirectory>
    </build>
</project>
```

*File → Open Project* on `nb-java` → full Java indexing (completion, navigation,
refactoring). It references the real sources in place — nothing is copied — and
leaves the CND make project untouched. You now edit the **C++** side and the
**Java** side of the same driver in one IDE.

### 4. Navigate between Java `native` methods and their C++ implementations

With both projects open and parsed, `cnd.mixeddev` links them. In a Java file
(e.g. `org/duckdb/DuckDBBindings.java`), hold **⌘ / Ctrl**, hover a `native`
method name until it underlines, and click:

- `duckdb_appender_close` → jumps to
  `Java_org_duckdb_DuckDBBindings_duckdb_1appender_1close` in
  `src/jni/bindings_appender.cpp`.

DuckDB uses the standard JNI export naming (`Java_<pkg>_<Class>_<method>`, with
`_1` as the mangled underscore), which is exactly what `cnd.mixeddev` computes
from the Java signature. Right-click a JNI class for **Generate JNI header** or
**Copy JNI signature**, and use **Attach with Native Debugger** to debug the
native side of a running JVM.

> If a jump reports *"Cannot navigate here!"*, the C++ code model hasn't finished
> parsing `src/jni` yet — let the CND make project finish scanning, then retry.

---

## Relationship to Apache NetBeans

These modules are intentionally **not** in Apache NetBeans: the ASF cannot ship
CDDL-licensed code as project source (CDDL is "Category B" under ASF licensing
policy), and these modules were never relicensed to Apache-2.0 nor IP-cleared
for donation. This repository does not change that. **Do not** submit this code
to Apache NetBeans without the ASF's formal IP-clearance process.

### The Apache-2.0 subset: `geertjanw/cnd-apache`

Oracle *did* donate **part** of CND to the ASF (the so-called "4th and 5th
donations"), and that part **was** IP-cleared and relicensed to Apache 2.0. It is
maintained on the [`apache/netbeans@cnd`](https://github.com/apache/netbeans/tree/cnd)
branch and packaged, with prebuilt plugins, at
[**`geertjanw/cnd-apache`**](https://github.com/geertjanw/cnd-apache).

| | **this repo (`geertjanw/cnd`)** | **[`geertjanw/cnd-apache`](https://github.com/geertjanw/cnd-apache)** |
|---|---|---|
| Source | NetBeans **8.2** (Sun/Oracle era) | Official `apache/netbeans@cnd` branch |
| License | **CDDL-1.0 OR GPL-2.0-only WITH Classpath-exception-2.0** | **Apache License 2.0** |
| Modules | ~86 `cnd` + `cnd.mixeddev` + 13 `dlight` | 26 `cnd` + 4 `cpplite` + 12 `dlight` |
| C/C++ intelligence | **native** NetBeans code model (zero-setup) | **clangd** via LSP (install clangd separately) |
| Refactoring, call graph, class view, DWARF discovery, CppUnit | ✅ included | ❌ not part of the donation |
| Java ↔ C/C++ JNI navigation (`cnd.mixeddev`) | ✅ included | ❌ depends on the native code model (not donated) |
| Can be contributed toward Apache NetBeans | ❌ needs ASF IP clearance first | ✅ already Apache-licensed & IP-cleared |

Use **this** repo for maximum 8.2 feature parity for local use (and you are fine
with CDDL/GPL); use **`cnd-apache`** if you need Apache-2.0 licensing — e.g. to
redistribute or to contribute toward Apache NetBeans.

---

## Disclaimer

This README describes licensing to the best of my understanding; it is **not
legal advice**. All trademarks are the property of their respective owners.
