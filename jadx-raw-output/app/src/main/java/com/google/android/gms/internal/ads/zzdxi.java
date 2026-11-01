package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxi {
    public static final zzguf zza;
    public static final zzguf zzb;
    private final String zzc;
    private final zzdxh zzd;
    private final zzdxh zze;

    public zzdxi(String str, zzdxh zzdxhVar, zzdxh zzdxhVar2) {
        this.zzc = str;
        this.zzd = zzdxhVar;
        this.zze = zzdxhVar2;
    }

    public final String zza() {
        return this.zzc;
    }

    public final zzdxh zzb() {
        return this.zzd;
    }

    public final zzdxh zzc() {
        return this.zze;
    }

    static {
        zzdxh zzdxhVar = zzdxh.PUBLIC_API_CALL;
        zzdxh zzdxhVar2 = zzdxh.PUBLIC_API_CALLBACK;
        zzdxi zzdxiVar = new zzdxi("tqgt", zzdxhVar, zzdxhVar2);
        zzdxh zzdxhVar3 = zzdxh.DYNAMITE_ENTER;
        zzdxi zzdxiVar2 = new zzdxi("l.dl", zzdxhVar, zzdxhVar3);
        zzdxh zzdxhVar4 = zzdxh.READ_FROM_DISK_START;
        zzdxi zzdxiVar3 = new zzdxi("l.rccde", zzdxhVar3, zzdxhVar4);
        zzdxi zzdxiVar4 = new zzdxi("l.rfd", zzdxhVar4, zzdxh.READ_FROM_DISK_END);
        zzdxh zzdxhVar5 = zzdxh.CLIENT_SIGNALS_START;
        zzdxi zzdxiVar5 = new zzdxi("l.rcc", zzdxhVar3, zzdxhVar5);
        zzdxh zzdxhVar6 = zzdxh.CLIENT_SIGNALS_END;
        zzdxi zzdxiVar6 = new zzdxi("l.cs", zzdxhVar5, zzdxhVar6);
        zzdxh zzdxhVar7 = zzdxh.SERVICE_CONNECTED;
        zzdxi zzdxiVar7 = new zzdxi("l.cts", zzdxhVar6, zzdxhVar7);
        zzdxh zzdxhVar8 = zzdxh.GMS_SIGNALS_START;
        zzdxh zzdxhVar9 = zzdxh.GMS_SIGNALS_END;
        zzdxi zzdxiVar8 = new zzdxi("l.gs", zzdxhVar8, zzdxhVar9);
        zzdxh zzdxhVar10 = zzdxh.GET_SIGNALS_SDKCORE_START;
        zzdxi zzdxiVar9 = new zzdxi("l.jse", zzdxhVar9, zzdxhVar10);
        zzdxh zzdxhVar11 = zzdxh.GET_SIGNALS_SDKCORE_END;
        zzdxi zzdxiVar10 = new zzdxi("l.gs-sdkcore", zzdxhVar10, zzdxhVar11);
        zzdxi zzdxiVar11 = new zzdxi("l.gs-pp", zzdxhVar11, zzdxhVar2);
        zzdxh zzdxhVar12 = zzdxh.RENDERING_START;
        zzdxi zzdxiVar12 = new zzdxi("l.render", zzdxhVar12, zzdxhVar2);
        zzdxh zzdxhVar13 = zzdxh.RENDERING_WEBVIEW_CREATION_START;
        zzdxh zzdxhVar14 = zzdxh.RENDERING_WEBVIEW_CREATION_END;
        zzdxh zzdxhVar15 = zzdxh.RENDERING_AD_COMPONENT_CREATION_END;
        zzdxh zzdxhVar16 = zzdxh.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdxh zzdxhVar17 = zzdxh.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdxh zzdxhVar18 = zzdxh.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdxh zzdxhVar19 = zzdxh.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzguf.zzo(zzdxiVar, zzdxiVar2, zzdxiVar3, zzdxiVar4, zzdxiVar5, zzdxiVar6, zzdxiVar7, zzdxiVar8, zzdxiVar9, zzdxiVar10, zzdxiVar11, zzdxiVar12, new zzdxi("l.render.pre", zzdxhVar12, zzdxhVar13), new zzdxi("l.render.wvc", zzdxhVar13, zzdxhVar14), new zzdxi("l.render.acc", zzdxhVar14, zzdxhVar15), new zzdxi("l.render.cfg-wv", zzdxhVar16, zzdxhVar17), new zzdxi("l.render.wvlh", zzdxhVar18, zzdxhVar19), new zzdxi("l.render.post", zzdxhVar19, zzdxhVar2), new zzdxi("l.sodv", zzdxh.SIGNAL_ON_DISK_VALIDATION_START, zzdxh.SIGNAL_ON_DISK_VALIDATION_END), new zzdxi("l.sodck", zzdxh.SIGNAL_ON_DISK_CACHE_KEY_START, zzdxh.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdxi("l.sodrar", zzdxh.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdxh.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdxi("l.soddc", zzdxh.SIGNAL_ON_DISK_DECODE_START, zzdxh.SIGNAL_ON_DISK_DECODE_END));
        zzdxi zzdxiVar13 = new zzdxi("l.al", zzdxhVar, zzdxhVar2);
        zzdxi zzdxiVar14 = new zzdxi("l.al2", zzdxhVar3, zzdxhVar2);
        zzdxi zzdxiVar15 = new zzdxi("l.dl", zzdxhVar, zzdxhVar3);
        zzdxi zzdxiVar16 = new zzdxi("l.rcc", zzdxhVar3, zzdxhVar5);
        zzdxi zzdxiVar17 = new zzdxi("l.cs", zzdxhVar5, zzdxhVar6);
        zzdxi zzdxiVar18 = new zzdxi("l.cts", zzdxhVar6, zzdxhVar7);
        zzdxi zzdxiVar19 = new zzdxi("l.gs", zzdxhVar8, zzdxhVar9);
        zzdxh zzdxhVar20 = zzdxh.GET_AD_DICTIONARY_SDKCORE_START;
        zzdxi zzdxiVar20 = new zzdxi("l.jse", zzdxhVar9, zzdxhVar20);
        zzdxh zzdxhVar21 = zzdxh.GET_AD_DICTIONARY_SDKCORE_END;
        zzdxi zzdxiVar21 = new zzdxi("l.gad-js", zzdxhVar20, zzdxhVar21);
        zzdxh zzdxhVar22 = zzdxh.HTTP_RESPONSE_READY;
        zzdxi zzdxiVar22 = new zzdxi("l.http", zzdxhVar21, zzdxhVar22);
        zzdxh zzdxhVar23 = zzdxh.SCAR_PRELOADER_READY;
        zzdxi zzdxiVar23 = new zzdxi("l.slas.pre", zzdxhVar, zzdxhVar23);
        zzdxh zzdxhVar24 = zzdxh.SCAR_PRELOADER_PROCESSING_DONE;
        zzdxi zzdxiVar24 = new zzdxi("l.slas.prel.p", zzdxhVar23, zzdxhVar24);
        zzdxh zzdxhVar25 = zzdxh.NORMALIZATION_AD_RESPONSE_START;
        zzdxh zzdxhVar26 = zzdxh.NORMALIZATION_AD_RESPONSE_END;
        zzdxh zzdxhVar27 = zzdxh.BINDER_CALL_START;
        zzdxh zzdxhVar28 = zzdxh.SERVER_RESPONSE_PARSE_START;
        zzdxh zzdxhVar29 = zzdxh.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzdxh zzdxhVar30 = zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdxh zzdxhVar31 = zzdxh.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzdxh zzdxhVar32 = zzdxh.NATIVE_ASSETS_LOADING_VIDEO_END;
        zzb = zzguf.zzo(zzdxiVar13, zzdxiVar14, zzdxiVar15, zzdxiVar16, zzdxiVar17, zzdxiVar18, zzdxiVar19, zzdxiVar20, zzdxiVar21, zzdxiVar22, zzdxiVar23, zzdxiVar24, new zzdxi("l.jse-nml", zzdxhVar22, zzdxhVar25), new zzdxi("l.jse-nml", zzdxhVar24, zzdxhVar25), new zzdxi("l.nml-js", zzdxhVar25, zzdxhVar26), new zzdxi("l.nml-gmsg", zzdxhVar26, zzdxhVar27), new zzdxi("l.nml-gmsg.s2s", zzdxhVar26, zzdxhVar28), new zzdxi("l.binder", zzdxhVar27, zzdxhVar28), new zzdxi("l.sr", zzdxhVar28, zzdxhVar12), new zzdxi("l.render", zzdxhVar12, zzdxhVar2), new zzdxi("l.t2", zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_END), new zzdxi("l.render.na.js", zzdxhVar29, zzdxhVar30), new zzdxi("l.render.na.prep", zzdxhVar30, zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_END), new zzdxi("l.render.na.lna", zzdxh.RENDERING_NATIVE_ASSETS_LOADING_START, zzdxh.RENDERING_NATIVE_ASSETS_LOADING_END), new zzdxi("l.render.wvc", zzdxhVar13, zzdxhVar14), new zzdxi("l.render.acc", zzdxhVar14, zzdxhVar15), new zzdxi("l.render.cfg-wv", zzdxhVar16, zzdxhVar17), new zzdxi("l.render.pre", zzdxhVar12, zzdxhVar13), new zzdxi("l.render.post", zzdxhVar19, zzdxhVar2), new zzdxi("l.render.na.post", zzdxhVar17, zzdxhVar2), new zzdxi("l.render.wvlh", zzdxhVar18, zzdxhVar19), new zzdxi("l.na.b", zzdxh.NATIVE_ASSETS_LOADING_BASIC_START, zzdxh.NATIVE_ASSETS_LOADING_BASIC_END), new zzdxi("l.na.im", zzdxh.NATIVE_ASSETS_LOADING_IMAGE_START, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_END), new zzdxi("l.na.imc", zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END), new zzdxi("l.na.l", zzdxh.NATIVE_ASSETS_LOADING_LOGO_START, zzdxh.NATIVE_ASSETS_LOADING_LOGO_END), new zzdxi("l.na.ic", zzdxh.NATIVE_ASSETS_LOADING_ICON_START, zzdxh.NATIVE_ASSETS_LOADING_ICON_END), new zzdxi("l.na.a", zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_END), new zzdxi("l.na.v", zzdxhVar31, zzdxhVar32), new zzdxi("l.na.vc", zzdxh.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzdxhVar32), new zzdxi("l.na.m", zzdxh.NATIVE_ASSETS_LOADING_MEDIA_START, zzdxh.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdxi("l.na.c", zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_START, zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdxi("l.na.o", zzdxh.NATIVE_ASSETS_LOADING_OMID_START, zzdxh.NATIVE_ASSETS_LOADING_OMID_END));
    }
}
