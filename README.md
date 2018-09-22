# Student-homework-manage

学生作业管理系统-2018-校内实训验收项目

![Student-homework-manage-结构视图](doc\Student-homework-manage-结构视图.png)

[TOC]

# 学生作业管理系统需求文档

## 系统简介

该系统主要用于学生作业的管理，用户登录时有三种身份可供选择，分别为学生、教师和管理员。学生有提交作业、查看成绩、查看作业任务公告等功能，老师有发布作业、批改作业、发布成绩等功能，管理员有添加、删除非管理员用户信息，添加、删除公告等功能。 

通过系统让学生递交作业更加灵活，大大减轻了老师的工作量和学生的学习任务，极大地提高了老师的工作效率和学生的学习效率。

## 细节提示

本系统用户包括：学生、教师、管理员，三种用户分别可实现以下功能

学生

1. 修改密码
2. 上传作业
3. 查看成绩
4. 查看作业任务
5. 返回主菜单

教师

1. 修改密码
2. 批改作业
3. 发布作业公告
4. 查看已发布作业任务
5. 返回主菜单

管理员

1. 修改密码
2. 添加学生
3. 添加老师
4. 返回主菜单

## 业务细节

### 登陆

进入系统后登陆界面如下，包含三个入口与一个退出出口，根据界面提示选择登陆对象，即：学生、管理员、教师，输入账户与密码，与系统所存数据一致则登陆成功跳转至对应的用户首页。

### 学生管理操作

#### 学生登录

选择1，输入对应学生的账号密码就可以进入学生信息管理页面。

#### 修改密码

选择修改密码的选项，就可以对现有的密码进行修改。

#### 上传作业

上传作业其实就是对需要完成的作业任务进行答案的提交，在这一项中需要先选择老师，输入老师的名字就可以出现对应的作业任务。

#### 查看成绩

可以查看完成的作业的成绩，这个部分的逻辑分为三个部分

1. 如果没有上传任何作业，就不会显示任何内容

2. 如果上传了作业，对应的老师没有修改，显示出来的成绩是0

3. 如果上传了作业，老师也进行了批改，那么显示的就是最终的成绩

#### 查看作业任务

在这个部分中可以查看老师发布的作业任务，用户输入想要查看的老师，会出现老师发布的未完成的作业，如果没有就显示为：你没有未完成的作业！！。

如果有，就显示作业，你可以选择是否去完成作业。

#### 返回主菜单

返回角色选择页面，可以继续选择以其他的身份登录系统。

### 教师管理操作

#### 老师登录

选择3，输入对应的账号密码可以进入教师管理的页面，对学生进行管理。

#### 修改密码

选择修改密码的选项，就可以对现有的密码进行修改。

#### 批改作业

在批改作业的功能里面可以对学生提交的作业进行批改和打分。

#### 发布作业任务

在发布作业任务的功能里面，老师可以发布要让学生完成的作业，发布之后会显示在学生要完成的作业列表中。

#### 查看已发布作业任务

在该功能中，会显示老师发布的所有的作业任务。

#### 返回主菜单

返回角色选择页面，可以继续选择以其他的身份登录系统。

### 管理员管理操作

#### 管理员登录

选择2，输入对应的账号密码可以进入管理员管理的页面。

#### 修改密码

选择修改密码的选项，就可以对现有的密码进行修改。

#### 添加学生

添加一个学生用户。此处的设计是可以同时添加多个学生，需要输入学生的姓名，学号，密码默认和学号相同。

#### 添加老师

基本流程和逻辑设计和学生添加一样，唯一个性化的是老师需要添加课程。

### 退出

执行退出操作之后，会退出系统。