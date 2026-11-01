package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.UiThread;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcb implements zzd {
    private final Application zza;
    private final zzbx zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzao zzf;
    private final zzbc zzg;
    private final zzaq zzh;

    public zzcb(Application application, zzbx zzbxVar, Handler handler, Executor executor, zze zzeVar, zzao zzaoVar, zzbc zzbcVar, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzbxVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzaoVar;
        this.zzg = zzbcVar;
        this.zzh = zzaqVar;
    }

    public static void safedk_zzbx_startActivity_24bad358b473cc839c51304e55795b87(zzbx p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/android/gms/internal/consent_sdk/zzbx;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, g.f44962h);
        p10.startActivity(p11);
    }

    public static /* synthetic */ void zzc(zzcb zzcbVar) {
        String strConcat;
        JSONObject jSONObject = new JSONObject();
        Application application = zzcbVar.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", strConcat);
            JSONObject jSONObject2 = new JSONObject();
            zzaq zzaqVar = zzcbVar.zzh;
            for (String str : zzaqVar.zzc().keySet()) {
                jSONObject2.put(str, zzaqVar.zzc().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        zzcbVar.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    @UiThread
    private final void zzg(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri uri = Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString)));
        }
        try {
            safedk_zzbx_startActivity_24bad358b473cc839c51304e55795b87(this.zzb, new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e10) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(strOptString)), e10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        final Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzbz
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @UiThread
    public final void zzd() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzca
            @Override // java.lang.Runnable
            public final void run() {
                zzcb.zzc(this.zza);
            }
        });
    }

    public final void zzf(int i10, String str, String str2) {
        this.zzg.zzj(new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i10), str2, str)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    @UiThread
    public final boolean zzb(String str, JSONObject jSONObject) {
        byte b10;
        byte b11 = -1;
        int i10 = 3;
        switch (str) {
            case "load_complete":
                b10 = 0;
                break;
            case "configure_app_assets":
                b10 = 3;
                break;
            case "browser":
                b10 = 2;
                break;
            case "dismiss":
                b10 = 1;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 != 2) {
                    if (b10 != 3) {
                        return false;
                    }
                    zzd();
                    return true;
                }
                zzg(jSONObject);
                return true;
            }
            String strOptString = jSONObject.optString("status");
            switch (strOptString.hashCode()) {
                case -954325659:
                    if (strOptString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                        b11 = 3;
                    }
                    break;
                case -258041904:
                    if (strOptString.equals("personalized")) {
                        b11 = 0;
                    }
                    break;
                case 429411856:
                    if (strOptString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                        b11 = 4;
                    }
                    break;
                case 467888915:
                    if (strOptString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                        b11 = 1;
                    }
                    break;
                case 1666911234:
                    if (strOptString.equals("non_personalized")) {
                        b11 = 2;
                    }
                    break;
                case 1725474845:
                    if (strOptString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                        b11 = 5;
                    }
                    break;
            }
            if (b11 != 0 && b11 != 1 && b11 != 2 && b11 != 3 && b11 != 4) {
                if (b11 != 5) {
                    this.zzg.zzh(new zzg(1, "We are getting something wrong with the webview."));
                } else {
                    i10 = 1;
                    this.zzg.zzg(i10);
                }
            } else {
                this.zzg.zzg(i10);
            }
            return true;
        }
        this.zzg.zzi();
        return true;
    }

    public final void zze(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        this.zze.zzb(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.zzf);
    }
}
