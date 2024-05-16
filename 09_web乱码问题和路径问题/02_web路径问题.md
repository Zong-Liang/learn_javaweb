# 02_web路径问题

### 绝对路径

绝对路径是从文件系统的根目录开始的完整路径。它包括从根目录到目标文件或目录的每个目录或子目录的名称。在类Unix系统中，根目录通常用正斜杠 (`/`) 表示，而在Windows系统中，根目录可以是驱动器字母 (如`C:`) 后跟反斜杠 (`\`) 。

例如：

- 在类Unix系统中，一个绝对路径可能是：`/home/user/documents/report.txt`
- 在Windows系统中，一个绝对路径可能是：`C:\Users\Username\Documents\Report.txt`

### 相对路径

相对路径是相对于当前工作目录的路径。它不从根目录开始，而是从当前所在的目录开始。相对路径使用`.`来表示当前目录，使用`..`来表示上一级目录。

例如：

- 如果当前工作目录是`/home/user`，那么相对路径`documents/report.txt`将指向`/home/user/documents/report.txt`。
- 如果当前工作目录是`/home/user/documents`，那么相对路径`../report.txt`也将指向`/home/user/report.txt`，因为它首先上溯到`/home/user`，然后寻找`report.txt`。

使用相对路径的好处是，当移动到不同的目录时，文件的引用仍然有效，因为它们是相对于当前位置的。而绝对路径则在任何位置都是相同的，因此它们在移动文件或目录时可能会变得无效。

> 浏览器对 WEB-INF 没有访问权限，需要通过请求转发实现访问。

`<head>` 中设置 `<base href="/home/user/">` (有更好的方法！)

不设置项目上下文路径 (实际开发中常用)：

![image-20240516152951172](https://cdn.jsdelivr.net/gh/Zong-Liang/ImageBed@main//202405161529309.png)