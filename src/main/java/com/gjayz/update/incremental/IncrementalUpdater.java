package com.gjayz.update.incremental;

import android.content.Context;

public class IncrementalUpdater {

    public static void checkVersionAndUpdate(Context context) {
        //1.向服务器发送请求验证是否存在更新版本
        boolean hasNewVersion = true;


        //2.存在，下载差分包

        //3.校验差分包是否有被修改
        //4.将差分包和本地程序合成新程序
        //5.验证合成的新版本apk文件是否与最新版本一致
        //6.安装新版本
    }
}