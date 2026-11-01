package com.yk.e.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.yk.e.util.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class InstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            String schemeSpecificPart = data.getSchemeSpecificPart();
            LogUtil.i("zhazha", "InstallReceiver 刚安装的APP包名：" + schemeSpecificPart);
            PackageManager packageManager = context.getPackageManager();
            try {
                String string = packageManager.getApplicationInfo(schemeSpecificPart, 0).loadLabel(packageManager).toString();
                LogUtil.i("zhazha", "InstallReceiver 刚安装的应用名称：" + string);
                TextUtils.isEmpty(string);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }
}
