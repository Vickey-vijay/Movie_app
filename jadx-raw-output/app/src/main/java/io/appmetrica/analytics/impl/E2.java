package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E2 implements ModulePreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4603vl f55157a;

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z10) {
        return ((AbstractC4695zd) this.f55157a).c(str, z10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i10) {
        return ((AbstractC4695zd) this.f55157a).c(str, i10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j10) {
        return ((AbstractC4695zd) this.f55157a).c(a(str), j10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((AbstractC4695zd) this.f55157a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z10) {
        AbstractC4695zd abstractC4695zd = (AbstractC4695zd) this.f55157a;
        ((Ye) ((InterfaceC4603vl) abstractC4695zd.b(abstractC4695zd.f(a(str)), z10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i10) {
        AbstractC4695zd abstractC4695zd = (AbstractC4695zd) this.f55157a;
        ((Ye) ((InterfaceC4603vl) abstractC4695zd.b(abstractC4695zd.f(str), i10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j10) {
        AbstractC4695zd abstractC4695zd = (AbstractC4695zd) this.f55157a;
        ((Ye) ((InterfaceC4603vl) abstractC4695zd.b(abstractC4695zd.f(a(str)), j10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        AbstractC4695zd abstractC4695zd = (AbstractC4695zd) this.f55157a;
        ((Ye) ((InterfaceC4603vl) abstractC4695zd.b(abstractC4695zd.f(a(str)), str2))).b();
    }

    public E2(InterfaceC4603vl interfaceC4603vl) {
        this.f55157a = interfaceC4603vl;
    }
}
