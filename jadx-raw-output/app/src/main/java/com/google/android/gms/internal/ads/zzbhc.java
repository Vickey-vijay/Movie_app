package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbhc implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;

    @VisibleForTesting
    public volatile boolean zza = false;

    @Nullable
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    public final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbgz
                    @Override // com.google.android.gms.internal.ads.zzgru
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x011f A[Catch: all -> 0x017a, TRY_ENTER, TryCatch #3 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0013, B:14:0x0015, B:16:0x0027, B:17:0x002b, B:18:0x002d, B:43:0x009d, B:44:0x00a4, B:53:0x00d3, B:54:0x00da, B:68:0x011f, B:69:0x0126, B:82:0x0168, B:83:0x016f, B:86:0x0172, B:87:0x0179, B:20:0x0042, B:33:0x005d, B:35:0x0066, B:36:0x006e, B:38:0x0074, B:40:0x0084, B:42:0x0099, B:46:0x00a6, B:48:0x00aa, B:50:0x00ba, B:52:0x00cf, B:56:0x00dc, B:66:0x011b, B:71:0x0128, B:73:0x0135, B:75:0x0143, B:76:0x014c, B:78:0x015a, B:80:0x015e, B:81:0x0161, B:59:0x00ed, B:61:0x00fb, B:63:0x0103, B:64:0x010e, B:24:0x0049, B:28:0x0053), top: B:98:0x0008, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0128 A[Catch: all -> 0x0171, TRY_ENTER, TryCatch #0 {all -> 0x0171, blocks: (B:20:0x0042, B:33:0x005d, B:35:0x0066, B:36:0x006e, B:38:0x0074, B:40:0x0084, B:42:0x0099, B:46:0x00a6, B:48:0x00aa, B:50:0x00ba, B:52:0x00cf, B:56:0x00dc, B:66:0x011b, B:71:0x0128, B:73:0x0135, B:75:0x0143, B:76:0x014c, B:78:0x015a, B:80:0x015e, B:81:0x0161, B:59:0x00ed, B:61:0x00fb, B:63:0x0103, B:64:0x010e, B:24:0x0049, B:28:0x0053), top: B:93:0x0042, outer: #3 }] */
    public final void zza(Context context) {
        Context applicationContext;
        final SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context context2 = this.zzg;
                SharedPreferences sharedPreferencesZzb = null;
                if (context2 == null) {
                    context2 = null;
                } else {
                    try {
                        applicationContext = context2.createPackageContext("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        applicationContext = null;
                    }
                    if (applicationContext != null || (applicationContext = context2.getApplicationContext()) != null) {
                        context2 = applicationContext;
                    }
                }
                if (context2 != null) {
                    com.google.android.gms.ads.internal.client.zzbd.zza();
                    sharedPreferencesZzb = zzbgx.zzb(context2);
                }
                if (sharedPreferencesZzb != null) {
                    zzbjw.zzc(new zzbgy(this, sharedPreferencesZzb));
                }
                if (!this.zzi) {
                    zzbio zzbioVar = zzbiw.zzd;
                    if (((Long) zzbioVar.zze()).longValue() > 0 && zzbgp.zzd(this.zzg) >= ((Long) zzbioVar.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                }
                if (!this.zzi) {
                    zzbio zzbioVar2 = zzbiw.zzf;
                    if (((Long) zzbioVar2.zze()).longValue() > 0 && zzbgp.zzc(this.zzg) >= ((Long) zzbioVar2.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                }
                Context context3 = this.zzg;
                if (!((Boolean) zzbje.zzk.zze()).booleanValue()) {
                    if (((Boolean) zzbje.zzl.zze()).booleanValue() && (sharedPreferences = context3.getSharedPreferences("admob", 0)) != null) {
                        try {
                            if (new JSONObject((String) zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbha
                                @Override // com.google.android.gms.internal.ads.zzgru
                                public final /* synthetic */ Object zza() {
                                    return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                }
                            })).optBoolean("local_flags_enabled")) {
                            }
                        } catch (JSONException unused3) {
                        }
                    }
                    if (context2 == null) {
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzbd.zza();
                    this.zze = zzbgx.zzb(context2);
                    if (!this.zzi && ((Boolean) zzbje.zze.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                    }
                    if (!((Boolean) zzbje.zzc.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    this.zza = false;
                    this.zzc.open();
                }
                context2 = this.zzg;
                if (context2 == null) {
                    this.zza = false;
                    this.zzc.open();
                    return;
                }
                com.google.android.gms.ads.internal.client.zzbd.zza();
                this.zze = zzbgx.zzb(context2);
                if (!this.zzi) {
                    com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                }
                if (!((Boolean) zzbje.zzc.zze()).booleanValue()) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                }
                zzg(this.zze);
                this.zzd = true;
                this.zza = false;
                this.zzc.open();
            } catch (Throwable th2) {
                this.zza = false;
                this.zzc.open();
                throw th2;
            }
        }
    }

    public final Object zzd(final zzbgv zzbgvVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbgvVar.zzf();
            }
        }
        if (zzbgvVar.zzm() != 2) {
            return (zzbgvVar.zzm() == 1 && this.zzh.has(zzbgvVar.zze())) ? zzbgvVar.zzc(this.zzh) : zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbhb
                @Override // com.google.android.gms.internal.ads.zzgru
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbgvVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbgvVar.zzf() : zzbgvVar.zza(bundle);
    }

    public final Object zze(zzbgv zzbgvVar) {
        return (this.zzd || this.zza) ? zzd(zzbgvVar) : zzbgvVar.zzf();
    }

    public final /* synthetic */ Object zzf(zzbgv zzbgvVar) {
        return zzbgvVar.zzd(this.zze);
    }
}
