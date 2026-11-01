package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3714t8;
import com.ironsource.InterfaceC3761w4;
import com.ironsource.InterfaceC3778x4;
import com.ironsource.InterfaceC3795y4;
import com.ironsource.Nb;
import com.ironsource.Y4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface l {

    public interface a {
        void a(f.a aVar);
    }

    public interface b {
        void a(Nb nb2);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(Y4 y10);

    void a(Y4 y10, Map<String, String> map, InterfaceC3761w4 interfaceC3761w4);

    void a(Y4 y10, Map<String, String> map, InterfaceC3778x4 interfaceC3778x4);

    void a(f.c cVar, a aVar);

    void a(String str, InterfaceC3778x4 interfaceC3778x4);

    void a(String str, String str2, Y4 y10, InterfaceC3761w4 interfaceC3761w4);

    void a(String str, String str2, Y4 y10, InterfaceC3778x4 interfaceC3778x4);

    void a(String str, String str2, Y4 y10, InterfaceC3795y4 interfaceC3795y4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC3761w4 interfaceC3761w4);

    void a(JSONObject jSONObject, InterfaceC3778x4 interfaceC3778x4);

    void a(JSONObject jSONObject, InterfaceC3795y4 interfaceC3795y4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(Y4 y10);

    void b(Y4 y10, Map<String, String> map, InterfaceC3778x4 interfaceC3778x4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C3714t8.c h();
}
