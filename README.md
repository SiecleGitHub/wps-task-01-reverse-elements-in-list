## This repository contains three implementations to reverse a list of elements.

```
Task: Drehe eine Liste von Elementen um

Original numbers: [ 1, 2, 3, 4, 5 ]
Reversed numbers: [ 5, 4, 3, 2, 1 ]
```

### The first solution is a Javascript snippet in a HTML file which could be executed with LiveServer.

```
The result could be seen in the console of the browser.
```

### The second solution is a Typescript file. The following commands allow to start the program.

```console
Call all commands from root directory

npm install --save-dev typescript ts-node

npx tsc --init

npx ts-node reverseArray.ts
```

### Finally the third solution is in Java.

```console
brew install openjdk

export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"

vim ~/.zshrc. // add the path to the .zshrc file

java -version

javac -d out src/ReverseArray.java

java -cp out ReverseArray
```
