package com.inmobi.media;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes9.dex */
public final class jo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jo f24636a = new jo();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3105pb f24637b = new C3105pb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2765bo f24638c;

    public static AdConfig.WebAssetCacheConfig a() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f23815a.a(AdConfig.class)).getWebAssetCache();
    }

    static {
        Context context = Ji.f22951a;
        f24638c = context != null ? new C2765bo(context, a()) : null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:118:0x0220  */
    /* JADX WARN: Code duplicated, block: B:120:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0225 A[Catch: TimeoutCancellationException -> 0x021b, Exception -> 0x02bc, TryCatch #25 {TimeoutCancellationException -> 0x021b, Exception -> 0x02bc, blocks: (B:111:0x0203, B:113:0x0209, B:121:0x0225, B:122:0x023c, B:125:0x0285, B:127:0x02a9), top: B:201:0x0203 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0285 A[Catch: TimeoutCancellationException -> 0x021b, Exception -> 0x02bc, TryCatch #25 {TimeoutCancellationException -> 0x021b, Exception -> 0x02bc, blocks: (B:111:0x0203, B:113:0x0209, B:121:0x0225, B:122:0x023c, B:125:0x0285, B:127:0x02a9), top: B:201:0x0203 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0308  */
    /* JADX WARN: Code duplicated, block: B:180:0x0335  */
    /* JADX WARN: Code duplicated, block: B:201:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c1 A[Catch: Exception -> 0x02c6, TimeoutCancellationException -> 0x02cd, TRY_LEAVE, TryCatch #23 {TimeoutCancellationException -> 0x02cd, Exception -> 0x02c6, blocks: (B:91:0x01bc, B:93:0x01c1), top: B:204:0x01bc }] */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x0225, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x0285, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:174:0x0308, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:180:0x0335, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01c1, please report this as an issue */
    public final Object a(String str, InterfaceC3028m9 interfaceC3028m9, ContinuationImpl continuationImpl) throws Throwable {
        go goVar;
        Map linkedHashMap;
        long jCurrentTimeMillis;
        String str2;
        Map map;
        InterfaceC3028m9 interfaceC3028m10;
        String str3;
        String str4;
        InterfaceC3028m9 interfaceC3028m11;
        String str5;
        nk.p0 p0Var;
        String str6;
        long jMax;
        Object obj;
        Map map2;
        long j10;
        Ne ne2;
        C3105pb c3105pb;
        boolean z10;
        Map map3;
        String str7 = str;
        if (continuationImpl instanceof go) {
            goVar = (go) continuationImpl;
            int i10 = goVar.f24469i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                goVar.f24469i = i10 - Integer.MIN_VALUE;
            } else {
                goVar = new go(this, continuationImpl);
            }
        } else {
            goVar = new go(this, continuationImpl);
        }
        Object objA = goVar.f24467g;
        Object objF = sj.a.f();
        int i11 = goVar.f24469i;
        String str8 = IronSourceConstants.EVENTS_ERROR_CODE;
        try {
            try {
                try {
                    try {
                        if (i11 == 0) {
                            kotlin.c.b(objA);
                            C2765bo c2765bo = f24638c;
                            if (c2765bo == null || c2765bo.f24094a == null) {
                                if (interfaceC3028m9 == null) {
                                    return null;
                                }
                                ((C3053n9) interfaceC3028m9).b("WebResourceHandler", "WebAsset Cache Helper was not Initialized. " + c2765bo + " for URL: " + str7);
                                return null;
                            }
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("url", str7);
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                                String mimeTypeFromExtension = F3.a(fileExtensionFromUrl) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
                                String str9 = (mimeTypeFromExtension == null || mimeTypeFromExtension.length() == 0) ? "text/html" : mimeTypeFromExtension;
                                if (interfaceC3028m9 != null) {
                                    StringBuilder sb2 = new StringBuilder();
                                    try {
                                        sb2.append("mimeType is ");
                                        sb2.append(str9);
                                        sb2.append(" for ");
                                        sb2.append(str7);
                                        String string = sb2.toString();
                                        C3053n9 c3053n9 = (C3053n9) interfaceC3028m9;
                                        str4 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        str2 = "WebResourceHandler";
                                        try {
                                            c3053n9.a(str2, string);
                                        } catch (TimeoutCancellationException e10) {
                                            e = e10;
                                            str8 = str4;
                                            str3 = str7;
                                            map = linkedHashMap;
                                            interfaceC3028m10 = interfaceC3028m9;
                                            j10 = jCurrentTimeMillis;
                                            map.put(str8, tj.a.f((short) 2193));
                                            if (interfaceC3028m10 != null) {
                                                ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                                            }
                                            map.put("networkType", C3298x5.m());
                                            map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                            Wj wj2 = Wj.f23753a;
                                            Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                            return null;
                                        } catch (Exception e11) {
                                            e = e11;
                                            str8 = str4;
                                            map = linkedHashMap;
                                            interfaceC3028m10 = interfaceC3028m9;
                                            j10 = jCurrentTimeMillis;
                                            map.put(str8, tj.a.f((short) 2195));
                                            if (interfaceC3028m10 != null) {
                                                ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                            }
                                            map.put("networkType", C3298x5.m());
                                            map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                            Wj wj3 = Wj.f23753a;
                                            Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                            return null;
                                        }
                                    } catch (TimeoutCancellationException e12) {
                                        e = e12;
                                        str8 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        str2 = "WebResourceHandler";
                                    } catch (Exception e13) {
                                        e = e13;
                                        str8 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        str2 = "WebResourceHandler";
                                    }
                                } else {
                                    str4 = IronSourceConstants.EVENTS_ERROR_CODE;
                                    str2 = "WebResourceHandler";
                                }
                                InputStream inputStreamA = c2765bo.a(str7, interfaceC3028m9);
                                if (inputStreamA != null) {
                                    if (interfaceC3028m9 != null) {
                                        ((C3053n9) interfaceC3028m9).a(str2, "Found in cache: " + str7);
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put("url", str7);
                                    Wj wj4 = Wj.f23753a;
                                    Wj.b("ResourceCacheHit", linkedHashMap2, EnumC2735ak.SDK);
                                    return F3.a(inputStreamA, str9);
                                }
                                C3105pb c3105pb2 = f24637b;
                                ho hoVar = new ho(str7, interfaceC3028m9, null);
                                goVar.f24461a = str7;
                                goVar.f24462b = interfaceC3028m9;
                                goVar.f24463c = linkedHashMap;
                                goVar.f24464d = str9;
                                goVar.f24466f = jCurrentTimeMillis;
                                goVar.f24469i = 1;
                                objA = c3105pb2.a(str7, hoVar, goVar);
                                if (objA == objF) {
                                    return objF;
                                }
                                interfaceC3028m11 = interfaceC3028m9;
                                str5 = str9;
                            } catch (TimeoutCancellationException e14) {
                                e = e14;
                                str8 = IronSourceConstants.EVENTS_ERROR_CODE;
                                str2 = "WebResourceHandler";
                            } catch (Exception e15) {
                                e = e15;
                                str8 = IronSourceConstants.EVENTS_ERROR_CODE;
                                str2 = "WebResourceHandler";
                            }
                        } else {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    j10 = goVar.f24466f;
                                    str5 = goVar.f24464d;
                                    map3 = goVar.f24463c;
                                    interfaceC3028m10 = goVar.f24462b;
                                    str3 = goVar.f24461a;
                                    try {
                                        kotlin.c.b(objA);
                                        str4 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        str6 = "WebResourceHandler";
                                        jCurrentTimeMillis = j10;
                                        obj = objF;
                                        map2 = map3;
                                        try {
                                            ne2 = (Ne) objA;
                                            if (interfaceC3028m10 != null) {
                                                try {
                                                    str2 = str6;
                                                    try {
                                                        ((C3053n9) interfaceC3028m10).c(str2, "Response received for url: " + str3);
                                                    } catch (TimeoutCancellationException e16) {
                                                        e = e16;
                                                        str8 = str4;
                                                        map = map2;
                                                        j10 = jCurrentTimeMillis;
                                                        map.put(str8, tj.a.f((short) 2193));
                                                        if (interfaceC3028m10 != null) {
                                                            ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                                                        }
                                                        map.put("networkType", C3298x5.m());
                                                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                                        Wj wj5 = Wj.f23753a;
                                                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                                        return null;
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        str8 = str4;
                                                        map = map2;
                                                        j10 = jCurrentTimeMillis;
                                                        map.put(str8, tj.a.f((short) 2195));
                                                        if (interfaceC3028m10 != null) {
                                                            ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                                        }
                                                        map.put("networkType", C3298x5.m());
                                                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                                        Wj wj6 = Wj.f23753a;
                                                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                                        return null;
                                                    }
                                                } catch (TimeoutCancellationException e18) {
                                                    e = e18;
                                                    str2 = str6;
                                                    str8 = str4;
                                                    map = map2;
                                                    j10 = jCurrentTimeMillis;
                                                    map.put(str8, tj.a.f((short) 2193));
                                                    if (interfaceC3028m10 != null) {
                                                        ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                                                    }
                                                    map.put("networkType", C3298x5.m());
                                                    map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                                    Wj wj7 = Wj.f23753a;
                                                    Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                                    return null;
                                                } catch (Exception e19) {
                                                    e = e19;
                                                    str2 = str6;
                                                    str8 = str4;
                                                    map = map2;
                                                    j10 = jCurrentTimeMillis;
                                                    map.put(str8, tj.a.f((short) 2195));
                                                    if (interfaceC3028m10 != null) {
                                                        ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                                    }
                                                    map.put("networkType", C3298x5.m());
                                                    map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                                    Wj wj8 = Wj.f23753a;
                                                    Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                                    return null;
                                                }
                                            } else {
                                                str2 = str6;
                                            }
                                            try {
                                                c3105pb = f24637b;
                                                goVar.f24461a = str3;
                                                goVar.f24462b = interfaceC3028m10;
                                                goVar.f24463c = map2;
                                                goVar.f24464d = str5;
                                                goVar.f24465e = ne2;
                                                goVar.f24466f = jCurrentTimeMillis;
                                                goVar.f24469i = 3;
                                                if (c3105pb.a(str3, goVar) == obj) {
                                                    return obj;
                                                }
                                                map = map2;
                                                j10 = jCurrentTimeMillis;
                                            } catch (TimeoutCancellationException e20) {
                                                e = e20;
                                                str8 = str4;
                                                map = map2;
                                                j10 = jCurrentTimeMillis;
                                                map.put(str8, tj.a.f((short) 2193));
                                                if (interfaceC3028m10 != null) {
                                                    ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                                                }
                                                map.put("networkType", C3298x5.m());
                                                map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                                Wj wj9 = Wj.f23753a;
                                                Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                                return null;
                                            } catch (Exception e21) {
                                                e = e21;
                                                str8 = str4;
                                                map = map2;
                                                j10 = jCurrentTimeMillis;
                                                map.put(str8, tj.a.f((short) 2195));
                                                if (interfaceC3028m10 != null) {
                                                    ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                                }
                                                map.put("networkType", C3298x5.m());
                                                map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                                Wj wj10 = Wj.f23753a;
                                                Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                                return null;
                                            }
                                        } catch (TimeoutCancellationException e22) {
                                            e = e22;
                                            str2 = str6;
                                        } catch (Exception e23) {
                                            e = e23;
                                            str2 = str6;
                                        }
                                    } catch (TimeoutCancellationException e24) {
                                        e = e24;
                                        map = map3;
                                        str8 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        str2 = "WebResourceHandler";
                                        map.put(str8, tj.a.f((short) 2193));
                                        if (interfaceC3028m10 != null) {
                                            ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                                        }
                                        map.put("networkType", C3298x5.m());
                                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                        Wj wj11 = Wj.f23753a;
                                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                        return null;
                                    } catch (Exception e25) {
                                        e = e25;
                                        interfaceC3028m11 = interfaceC3028m10;
                                        linkedHashMap = map3;
                                        map = linkedHashMap;
                                        interfaceC3028m10 = interfaceC3028m11;
                                        str2 = "WebResourceHandler";
                                        map.put(str8, tj.a.f((short) 2195));
                                        if (interfaceC3028m10 != null) {
                                            ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                        }
                                        map.put("networkType", C3298x5.m());
                                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                        Wj wj12 = Wj.f23753a;
                                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                        return null;
                                    }
                                } else {
                                    if (i11 != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    j10 = goVar.f24466f;
                                    ne2 = goVar.f24465e;
                                    str5 = goVar.f24464d;
                                    Map map4 = goVar.f24463c;
                                    InterfaceC3028m9 interfaceC3028m12 = goVar.f24462b;
                                    String str10 = goVar.f24461a;
                                    try {
                                        kotlin.c.b(objA);
                                        str3 = str10;
                                        map = map4;
                                        interfaceC3028m10 = interfaceC3028m12;
                                        str4 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        str2 = "WebResourceHandler";
                                    } catch (TimeoutCancellationException e26) {
                                        e = e26;
                                        str3 = str10;
                                        map = map4;
                                        interfaceC3028m10 = interfaceC3028m12;
                                        str8 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        str2 = "WebResourceHandler";
                                        map.put(str8, tj.a.f((short) 2193));
                                        if (interfaceC3028m10 != null) {
                                            ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                                        }
                                        map.put("networkType", C3298x5.m());
                                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                        Wj wj13 = Wj.f23753a;
                                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                        return null;
                                    } catch (Exception e27) {
                                        e = e27;
                                        map = map4;
                                        interfaceC3028m10 = interfaceC3028m12;
                                        str2 = "WebResourceHandler";
                                        map.put(str8, tj.a.f((short) 2195));
                                        if (interfaceC3028m10 != null) {
                                            ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                        }
                                        map.put("networkType", C3298x5.m());
                                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                        Wj wj14 = Wj.f23753a;
                                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                        return null;
                                    }
                                }
                                if (ne2 == null) {
                                    try {
                                        if (AbstractC2891gl.a(ne2) || ne2.d().string(lk.c.f63591b).length() <= 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                    } catch (TimeoutCancellationException e28) {
                                        e = e28;
                                        str8 = str4;
                                        map.put(str8, tj.a.f((short) 2193));
                                        if (interfaceC3028m10 != null) {
                                            ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                                        }
                                        map.put("networkType", C3298x5.m());
                                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                        Wj wj15 = Wj.f23753a;
                                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                        return null;
                                    } catch (Exception e29) {
                                        e = e29;
                                        str8 = str4;
                                        map.put(str8, tj.a.f((short) 2195));
                                        if (interfaceC3028m10 != null) {
                                            ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                        }
                                        map.put("networkType", C3298x5.m());
                                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                        Wj wj16 = Wj.f23753a;
                                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                        return null;
                                    }
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    if (interfaceC3028m10 != null) {
                                        ((C3053n9) interfaceC3028m10).c(str2, "onSuccessfulResponse: " + str3);
                                    }
                                    map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                    map.put("size", tj.a.e(((long) ne2.b().f22866c) / 1024));
                                    map.put("networkType", C3298x5.m());
                                    Wj wj17 = Wj.f23753a;
                                    Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                    ik.i iVar = Se.f23518a;
                                    ck.p.j(ne2, "<this>");
                                    return F3.a(new ByteArrayInputStream(ne2.d().toByteArray()), str5);
                                }
                                if (interfaceC3028m10 != null) {
                                    ((C3053n9) interfaceC3028m10).b(str2, "onFailedResponse: " + str3 + com.ironsource.Z7.f27998r + ne2);
                                }
                                str8 = str4;
                                try {
                                    map.put(str8, tj.a.f((short) 2194));
                                } catch (TimeoutCancellationException e30) {
                                    e = e30;
                                    map.put(str8, tj.a.f((short) 2193));
                                    if (interfaceC3028m10 != null) {
                                        ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                                    }
                                } catch (Exception e31) {
                                    e = e31;
                                    map.put(str8, tj.a.f((short) 2195));
                                    if (interfaceC3028m10 != null) {
                                        ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                    }
                                }
                            } else {
                                j10 = goVar.f24466f;
                                str5 = goVar.f24464d;
                                linkedHashMap = goVar.f24463c;
                                interfaceC3028m11 = goVar.f24462b;
                                String str11 = goVar.f24461a;
                                try {
                                    kotlin.c.b(objA);
                                    str4 = IronSourceConstants.EVENTS_ERROR_CODE;
                                    str2 = "WebResourceHandler";
                                    jCurrentTimeMillis = j10;
                                    str7 = str11;
                                } catch (TimeoutCancellationException e32) {
                                    e = e32;
                                    map3 = linkedHashMap;
                                    interfaceC3028m10 = interfaceC3028m11;
                                    str3 = str11;
                                    map = map3;
                                    str8 = IronSourceConstants.EVENTS_ERROR_CODE;
                                    str2 = "WebResourceHandler";
                                    map.put(str8, tj.a.f((short) 2193));
                                    if (interfaceC3028m10 != null) {
                                        ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                                    }
                                    map.put("networkType", C3298x5.m());
                                    map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                    Wj wj18 = Wj.f23753a;
                                    Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                    return null;
                                } catch (Exception e33) {
                                    e = e33;
                                    map = linkedHashMap;
                                    interfaceC3028m10 = interfaceC3028m11;
                                    str2 = "WebResourceHandler";
                                    map.put(str8, tj.a.f((short) 2195));
                                    if (interfaceC3028m10 != null) {
                                        ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                    }
                                    map.put("networkType", C3298x5.m());
                                    map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                                    Wj wj19 = Wj.f23753a;
                                    Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                                    return null;
                                }
                            }
                            map.put("networkType", C3298x5.m());
                            map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                            Wj wj110 = Wj.f23753a;
                            Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                            return null;
                        }
                        io ioVar = new io(interfaceC3028m11, str7, p0Var, null);
                        goVar.f24461a = str7;
                        goVar.f24462b = interfaceC3028m11;
                        goVar.f24463c = linkedHashMap;
                        goVar.f24464d = str5;
                        goVar.f24466f = jCurrentTimeMillis;
                        goVar.f24469i = 2;
                        objA = TimeoutKt.c(jMax, ioVar, goVar);
                        obj = objF;
                        if (objA == obj) {
                            return obj;
                        }
                        InterfaceC3028m9 interfaceC3028m13 = interfaceC3028m11;
                        str3 = str7;
                        map2 = linkedHashMap;
                        interfaceC3028m10 = interfaceC3028m13;
                        ne2 = (Ne) objA;
                        if (interfaceC3028m10 != null) {
                            str2 = str6;
                            ((C3053n9) interfaceC3028m10).c(str2, "Response received for url: " + str3);
                        } else {
                            str2 = str6;
                        }
                        c3105pb = f24637b;
                        goVar.f24461a = str3;
                        goVar.f24462b = interfaceC3028m10;
                        goVar.f24463c = map2;
                        goVar.f24464d = str5;
                        goVar.f24465e = ne2;
                        goVar.f24466f = jCurrentTimeMillis;
                        goVar.f24469i = 3;
                        if (c3105pb.a(str3, goVar) == obj) {
                            return obj;
                        }
                        map = map2;
                        j10 = jCurrentTimeMillis;
                        if (ne2 == null) {
                            z10 = false;
                        } else if (AbstractC2891gl.a(ne2)) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (interfaceC3028m10 != null) {
                                ((C3053n9) interfaceC3028m10).c(str2, "onSuccessfulResponse: " + str3);
                            }
                            map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                            map.put("size", tj.a.e(((long) ne2.b().f22866c) / 1024));
                            map.put("networkType", C3298x5.m());
                            Wj wj111 = Wj.f23753a;
                            Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                            ik.i iVar2 = Se.f23518a;
                            ck.p.j(ne2, "<this>");
                            return F3.a(new ByteArrayInputStream(ne2.d().toByteArray()), str5);
                        }
                        if (interfaceC3028m10 != null) {
                            ((C3053n9) interfaceC3028m10).b(str2, "onFailedResponse: " + str3 + com.ironsource.Z7.f27998r + ne2);
                        }
                        str8 = str4;
                        map.put(str8, tj.a.f((short) 2194));
                        map.put("networkType", C3298x5.m());
                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                        Wj wj112 = Wj.f23753a;
                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                        return null;
                    } catch (TimeoutCancellationException e34) {
                        e = e34;
                        str2 = str6;
                        str8 = str4;
                        map = linkedHashMap;
                        interfaceC3028m10 = interfaceC3028m11;
                        str3 = str7;
                        j10 = jCurrentTimeMillis;
                        map.put(str8, tj.a.f((short) 2193));
                        if (interfaceC3028m10 != null) {
                            ((C3053n9) interfaceC3028m10).a(str2, "Timeout occurred for url: " + str3, e);
                        }
                        map.put("networkType", C3298x5.m());
                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                        Wj wj113 = Wj.f23753a;
                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                        return null;
                    } catch (Exception e35) {
                        e = e35;
                        str2 = str6;
                        str8 = str4;
                        map = linkedHashMap;
                        interfaceC3028m10 = interfaceC3028m11;
                        j10 = jCurrentTimeMillis;
                        map.put(str8, tj.a.f((short) 2195));
                        if (interfaceC3028m10 != null) {
                            ((C3053n9) interfaceC3028m10).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                        }
                        map.put("networkType", C3298x5.m());
                        map.put("latency", tj.a.e(System.currentTimeMillis() - j10));
                        Wj wj114 = Wj.f23753a;
                        Wj.b("ResourceCacheMiss", map, EnumC2735ak.SDK);
                        return null;
                    }
                    jMax = ((long) Math.max(1, a().getMaxRetries())) * ((long) a().getTimeout());
                } catch (TimeoutCancellationException e36) {
                    e = e36;
                    str2 = str6;
                } catch (Exception e37) {
                    e = e37;
                    str2 = str6;
                }
                str6 = str2;
            } catch (TimeoutCancellationException e38) {
                e = e38;
            } catch (Exception e39) {
                e = e39;
            }
            p0Var = (nk.p0) objA;
        } catch (TimeoutCancellationException e40) {
            e = e40;
        } catch (Exception e41) {
            e = e41;
        }
    }

    public static nk.p0 a(String str, InterfaceC3028m9 interfaceC3028m9) {
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("WebResourceHandler", "downloadResourceFile(): " + str);
        }
        return ((C3227u9) He.f22813d.getValue()).a(new Je(str, null, new C3114pk(a().getTimeout(), a().getTimeout(), a().getTimeout()), null, new Ai(500L, a().getMaxRetries()), false, 42));
    }
}
