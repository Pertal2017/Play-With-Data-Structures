# 如何使用Github
## 相关软件
### Git
Git是一个开源分布式版本控制系统，简单来说就如同**系统备份**可以备份你写的代码，并且可以回溯你之前的代码。
### SourceTree
SourceTree是一个**图形化**的Git客户端，简单来说就是能够让我们通过像操作Windows那样更加容易的完成自己的代码版本控制。
## 软件安装
### Git安装
Git的下载需要到其官网下载，这里给出其Windows版本的链接[Git For Windows](https://git-scm.com/download/win)，直接点击**Click here to download manually**即可下载适合自己版本的Git,至于安装无脑下一步即可。
### SourceTree安装
SourceTree的下载同样在其[官方网站](https://www.sourcetreeapp.com/)能够下载到，由于我自己已经安装了SourceTree所以这里给出[SourceTree安装（小白特别详细教程）](https://www.jianshu.com/p/dce21c4e88fc)。
## 创建属于自己的远程仓库
1. 在创建自己的远程仓库之前，我们需要拥有自己的GitHub账号，登录[GitHub](https://github.com/)既可以创建，这里推荐**谷歌浏览器**因为其自带翻译功能，毕竟对于新手来说，英语也是一个门槛，在完成自己账号的创建登录之后选择上方的**加号**，选择**New repository**  

<center>
<img src="https://github.com/Pertal2017/Images/blob/master/PlayWithDataStructures/Introuctions/HowToUseGit/Step1.png" height="100" width="100">
</center>

2. 跳转页面后在**Repository name**中填入自己的仓库名，**Description**中填入对此仓库的描述，这里注意的是由于初期我们使用的是**SourceTree**因此勾选**Initialize this repository with a README**可以减少对仓库的初始化操作，交由Github完成，最后点击**Create repository**即可创建自己的GitHub远程仓库。

<center>
<img src="https://github.com/Pertal2017/Images/blob/master/PlayWithDataStructures/Introuctions/HowToUseGit/Step2.png" height="100" width="100">
</center>

3. 创建完成后，选择**Code**按钮，在**Clone With HTTPS**中会给出一个**URL**链接，复制这个链接即可。  
Note:当然这里也可以选择**Use SSH**,通过SSH密钥的方式登入，这里不做赘述。

<center>
<img src="https://github.com/Pertal2017/Images/blob/master/PlayWithDataStructures/Introuctions/HowToUseGit/Step3.png" height="100" width="100">
</center>

4. 在本地打开我们的**SourceTree**按住**Ctrl+N**打开一个页面，选择上方的**Clone**填入**URL**以及**本地保存路径**点击**克隆**即可

<center>
<img src="https://github.com/Pertal2017/Images/blob/master/PlayWithDataStructures/Introuctions/HowToUseGit/Step3.png" height="100" width="100">
</center>

## 相关鸣谢与引用
## 后续补充 -- 这里是后续会补充的内容 