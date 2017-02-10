# Toasty 吐司工具
### 项目中要向用户进行提示就会用到Toast，当然也可以选择使用Snackbar，这里只是介绍Toast。将Toast根据自己项目的要求改造成更好看的样式，如修改背景色，添加图标等。
### 使用方法：
#### 1.导入module:toasty;
#### 2.调用:我们已经对其进行了简单的封装，如防止暴露点击事件引起的长时间显示吐司。调用的方法都在ToastUtils这个工具类中，调用方法也特别简单：
#### 1）显示一个错误提示消息
```
ToastUtils.showErrorToast(MainActivity.this, "This is an error toast.");
```
![](https://github.com/youyutongxue/Toasty/blob/master/app/src/main/java/com/virgil/toasty/art/error.jpeg)

#### 2）显示一个成功提示消息
```
ToastCustomUtils.showSuccessToast(MainActivity.this, "Success！");
```
![](https://github.com/youyutongxue/Toasty/blob/master/app/src/main/java/com/virgil/toasty/art/success.jpeg)

#### 3）显示一个提示信息
```
ToastCustomUtils.showInfoToast(MainActivity.this, "Here is some info for you.");
```
![](https://github.com/youyutongxue/Toasty/blob/master/app/src/main/java/com/virgil/toasty/art/info.jpeg)

#### 4）显示一个警告信息
```
ToastCustomUtils.showWarningToast(MainActivity.this, "Beware of the dog.");
```
![](https://github.com/youyutongxue/Toasty/blob/master/app/src/main/java/com/virgil/toasty/art/warning.jpeg)

#### 5）显示一个普通吐司
```
ToastCustomUtils.showNormalToast(MainActivity.this, "Normal toast w/o icon");
```
![](https://github.com/youyutongxue/Toasty/blob/master/app/src/main/java/com/virgil/toasty/art/normal.jpeg)

#### 6）显示一个带图标的普通吐司
```
Drawable icon = getResources().getDrawable(R.drawable.ic_pets_white_48dp);
ToastCustomUtils.showNormalIconToast(MainActivity.this, "Normal toast w/ icon", icon);
```
![](https://github.com/youyutongxue/Toasty/blob/master/app/src/main/java/com/virgil/toasty/art/normal_icon.jpeg)
