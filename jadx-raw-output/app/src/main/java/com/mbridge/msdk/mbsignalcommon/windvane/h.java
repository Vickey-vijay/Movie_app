package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WindVaneSignalCommunication.java */
/* JADX INFO: loaded from: classes11.dex */
public class h implements b, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pattern f36138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36139b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f36141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WindVaneWebView f36142e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36140c = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f36143f = new Handler(Looper.getMainLooper(), this);

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.f36142e = windVaneWebView;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f36142e, str);
        if (aVarA != null) {
            aVarA.f36112b = this.f36142e;
            return aVarA;
        }
        Matcher matcher = this.f36138a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f36116f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.f36114d = matcher.group(1);
                aVar.f36117g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.f36115e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.f36013k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.f36115e = com.mbridge.msdk.mbsignalcommon.base.e.f36013k.get(aVar.f36115e);
                }
                aVar.f36112b = this.f36142e;
                return aVar;
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    public void d(String str) {
        this.f36139b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = aVar.f36113c;
                com.mbridge.msdk.mbsignalcommon.mapping.b.C0354b c0354b = aVar.f36111a;
                if (c0354b != null && obj != null) {
                    Object[] objArr = new Object[2];
                    objArr[0] = aVar;
                    objArr[1] = TextUtils.isEmpty(aVar.f36116f) ? JsonUtils.EMPTY_JSON : aVar.f36116f;
                    c0354b.a(obj, objArr);
                }
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    public h(Context context) {
        this.f36141d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (i.f(str)) {
            a(i.c(str));
            d(str);
            return true;
        }
        return false;
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f36112b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f36114d);
        if (jsObject == null) {
            return;
        }
        try {
            com.mbridge.msdk.mbsignalcommon.mapping.b.C0354b c0354bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.f36141d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f36115e, Object.class, String.class);
            c0354bA.a();
            if (jsObject instanceof g) {
                aVar.f36111a = c0354bA;
                aVar.f36113c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void a(int i10, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = aVar;
        this.f36143f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.f36138a = pattern;
    }
}
