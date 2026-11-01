package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.BuildConfig;
import io.bidmachine.BidMachine;

/* JADX INFO: renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class C3681r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30615a = "IntegrationHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30616b = "getNetworkSDKVersion";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30617c = "getAdapterSDKVersion";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30618d = "getAdapterVersion";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30619e = "getVersion";

    /* JADX INFO: renamed from: com.ironsource.r9$a */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f30620a;

        public a(Context context) {
            this.f30620a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(C3681r9.f30615a, "--------------- Google Play Services --------------");
                if (this.f30620a.getPackageManager().getApplicationInfo(this.f30620a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.i(C3681r9.f30615a, "Google Play Services - VERIFIED");
                    String strB = com.ironsource.mediationsdk.r.m().b(this.f30620a);
                    if (!TextUtils.isEmpty(strB)) {
                        Log.i(C3681r9.f30615a, "GAID is: " + strB + " (use this for test devices)");
                    }
                } else {
                    Log.e(C3681r9.f30615a, "Google Play Services - MISSING");
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                Log.e(C3681r9.f30615a, "Google Play Services - MISSING");
            }
        }
    }

    private static boolean a(Context context, String str) {
        Object objNewInstance;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            byte b10 = -1;
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -805296079) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 497130182 && lowerCase.equals("facebook")) {
                        b10 = 0;
                    }
                } else if (lowerCase.equals("admob")) {
                    b10 = 1;
                }
            } else if (lowerCase.equals("vungle")) {
                b10 = 2;
            }
            if (b10 == 0) {
                Log.i(f30615a, "--------------- Meta --------------");
            } else if (b10 == 1) {
                Log.i(f30615a, "--------------- Google (AdMob and Ad Manager) --------------");
            } else if (b10 != 2) {
                Log.i(f30615a, "--------------- " + str + " --------------");
            } else {
                Log.i(f30615a, "--------------- Liftoff Monetization --------------");
            }
            try {
                Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                try {
                    objNewInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                } catch (NoSuchMethodException unused) {
                    objNewInstance = cls.getConstructor(null).newInstance(null);
                }
                b(objNewInstance);
                a(objNewInstance);
                return true;
            } catch (ClassNotFoundException e10) {
                C3676r4.d().a(e10);
                Log.e(f30615a, "Adapter - MISSING");
                return false;
            } catch (Exception e11) {
                C3676r4.d().a(e11);
                Log.e(f30615a, "Failed to instantiate adapter");
                return false;
            }
        } catch (Exception e12) {
            C3676r4.d().a(e12);
            Log.e(f30615a, "isAdapterValid " + str, e12);
            return false;
        }
    }

    public static void b(Context context) {
        Log.i(f30615a, "Verifying Integration:");
        c(context);
        String[] strArr = {"AppLovin", "APS", BidMachine.NAME, "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", Q6.H1, "Verve", "Yandex", "YSO"};
        for (int i10 = 0; i10 < 26; i10++) {
            String str = strArr[i10];
            if (!a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "vungle":
                        Log.i(f30615a, ">>>> Liftoff Monetization - NOT VERIFIED");
                        break;
                    case "admob":
                        Log.i(f30615a, ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED");
                        break;
                    case "facebook":
                        Log.i(f30615a, ">>>> Meta - NOT VERIFIED");
                        break;
                    default:
                        Log.e(f30615a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str);
                lowerCase2.hashCode();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                        }
                        break;
                    case 92668925:
                        if (lowerCase2.equals("admob")) {
                        }
                        break;
                    case 497130182:
                        if (!lowerCase2.equals("facebook")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    */
                /*
                    Method dump skipped, instruction units count: 322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3681r9.b(android.content.Context):void");
            }

            private static void c(Context context) {
                Log.i(f30615a, "*** Permissions ***");
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
                    Log.i(f30615a, "android.permission.INTERNET - VERIFIED");
                } else {
                    Log.e(f30615a, "android.permission.INTERNET - MISSING");
                }
                if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                    Log.i(f30615a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
                } else {
                    Log.e(f30615a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
                }
            }

            private static void b(Object obj) {
                try {
                    Log.i(f30615a, "SDK Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? f30616b : f30617c, null).invoke(obj, null)));
                } catch (Exception e10) {
                    C3676r4.d().a(e10);
                    Log.w(f30615a, "Unable to get SDK version");
                }
            }

            private static void a(Context context) {
                new a(context).start();
            }

            private static void a(Object obj) {
                try {
                    Log.i(f30615a, "Adapter Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? f30618d : "getVersion", null).invoke(obj, null)));
                } catch (Exception e10) {
                    C3676r4.d().a(e10);
                    Log.w(f30615a, "Unable to get adapter version");
                }
            }
        }
