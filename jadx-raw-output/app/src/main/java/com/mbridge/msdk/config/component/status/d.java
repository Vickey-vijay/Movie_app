package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MBPreferenceChangeEventPublisher.java */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f33569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f33570b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.mbridge.msdk.config.component.status.a> f33571c = new ArrayList<>(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f33572d = new a();

    /* JADX INFO: compiled from: MBPreferenceChangeEventPublisher.java */
    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.f33569a == null || !d.this.f33569a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("AppPreferencesChanged");
            HashMap map = new HashMap();
            try {
                Object obj = d.this.f33569a.getAll().get(str);
                map.put("Key", str);
                map.put("Value", obj);
            } catch (Exception unused) {
                map.put("Key", str);
                map.put("Value", d.this.f33569a.getString(str, ""));
            }
            if (d.this.f33570b.isEmpty()) {
                bVar.a(map);
                d.this.a(bVar);
            } else if (d.this.f33570b.contains(str)) {
                bVar.a(map);
                d.this.a(bVar);
            }
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f33571c.remove(aVar);
        }
    }

    public d(String str) {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        Context applicationContext = contextD.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f33569a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f33572d);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f33571c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f33570b.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        Iterator<com.mbridge.msdk.config.component.status.a> it = this.f33571c.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }
}
