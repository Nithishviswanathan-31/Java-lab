## Exp 08 — File operations in Java

Java program demonstrating file information retrieval and file operations
using the java.io.File class.

| File | Description |
|------|-------------|
| Filedemo.java | Displays file metadata — name, path, permissions, type, size, and deletes it |

## Operations demonstrated

| Method | Output |
|--------|--------|
| f1.getName() | Name of the file |
| f1.getPath() | Full path of the file |
| f1.getParent() | Parent directory |
| f1.exists() | Whether file exists |
| f1.canRead() | Read permission check |
| f1.canWrite() | Write permission check |
| f1.isDirectory() | Is it a folder? |
| f1.isFile() | Is it a file? |
| f1.lastModified() | Last modified timestamp |
| f1.length() | Size in bytes |
| f1.delete() | Deletes the file |

## Concepts used
- java.io.File class
- Scanner for runtime filename input
- Boolean file property methods
- File deletion using delete()

## Sample output

```
Enter the filename: demo.txt
*****************
FILE INFORMATION
*****************
NAME OF THE FILE    : demo.txt
PATH OF THE FILE    : demo.txt
PARENT              : null
THE FILE EXISTS
THE FILE CAN BE READ
WRITE OPERATION IS PERMITTED
NOT A DIRECTORY
IT IS A FILE
File last modified  : 1730000000000
LENGTH OF THE FILE  : 512
FILE DELETED        : true
```

## How to compile & run
```bash
javac Filedemo.java
java filedemo
```