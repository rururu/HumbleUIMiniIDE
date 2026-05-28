# HumbleUIMiniIDE
A minimalistic integrated development environment for the Clojure programming language.

This is a special edition of the [ClojureMiniIDE](https://github.com/rururu/ClojureMiniIDE) for the Clojure GUI library [HumbleUI](https://github.com/HumbleUI/HumbleUI/tree/main).

![screenshot](1.png)

## Special Features

1. **Program.** 
In Clojure, there's no concept of a "program"; there's only the concept of a "namespace". 
These aren't quite the same thing. A given task typically requires multiple namespaces. 
ClojureMiniIDE defines a *program* as an ordered sequence of namespaces. 
The order is determined by the order in which namespaces must be loaded, 
as this is essential for program operation. 
A special button is available for automatically loading a program.

2. **Separate windows for functions and other program elements.** 
This allows you to simultaneously edit multiple functions and other program elements on the screen, from different namespaces, 
and only those needed at the moment. The automatic loading button simultaneously 
composes ("builds") various namespaces from all open and possibly modified elements, 
saves them, and loads them in the desired order.

## Usage

```shell
$ cd <UumbleUIMiniIDE directory>
$ ./run.sh       # Linux, MacOS
$ run.bat        # Windows
```

## Construct prefixces

To create separate windows for functions and other program elements, the namespace file is divided into sections. 
A separate section is created for a program element whose name begins with a prefix from the ConstructPrefixes.txt file. 
Initially, it contains the prefixes "ns" and "def." 
If your programming environment contains other constructs, 
add the corresponding prefixes to separate lines in this file.

## Video Lessons

[Lesson 1. HumbleUI Examples](https://www.youtube.com/watch?v=aVcTWrnw5Wg)

[Lesson 2. Simple Program](https://www.youtube.com/watch?v=1GceJ_KvfRA)

## License

Copyright © 2025-2026 Ruslan Sorokin

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
