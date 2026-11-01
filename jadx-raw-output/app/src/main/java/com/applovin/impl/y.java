package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static y f10113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f10114f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f10115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10118d;

    public static y a(Context context) {
        y yVar;
        synchronized (f10114f) {
            if (f10113e == null) {
                f10113e = new y(context);
            }
            yVar = f10113e;
        }
        return yVar;
    }

    private y(Context context) throws Throwable {
        Bundle bundle;
        int iIntValue;
        String str = null;
        str = null;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                bundle = applicationInfo.metaData;
                try {
                    String str2 = applicationInfo.processName;
                    this.f10115a = bundle;
                    this.f10118d = str2;
                } catch (PackageManager.NameNotFoundException e10) {
                    e = e10;
                    com.applovin.impl.sdk.o.c("AndroidManifest", "Failed to get meta data.", e);
                    this.f10115a = bundle;
                    this.f10118d = null;
                }
            } catch (Throwable th2) {
                th = th2;
                this.f10115a = bundle;
                this.f10118d = str;
                throw th;
            }
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            bundle = null;
        } catch (Throwable th3) {
            th = th3;
            bundle = null;
            this.f10115a = bundle;
            this.f10118d = str;
            throw th;
        }
        str = null;
        boolean z10 = false;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i10 = 0; i10 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i10++) {
                                String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i10);
                                String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = zBooleanValue;
                        try {
                            com.applovin.impl.sdk.o.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.f10116b = iIntValue;
                            this.f10117c = z10;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.f10116b = iIntValue;
            this.f10117c = zBooleanValue;
        } catch (Throwable th5) {
            th = th5;
            iIntValue = 0;
        }
    }

    public boolean a(String str) {
        Bundle bundle = this.f10115a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f10115a;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }

    public String a() {
        return this.f10118d;
    }
}
