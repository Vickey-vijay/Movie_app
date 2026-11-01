package com.bytedance.sdk.component.ra.vt;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.vt.ouw.bly;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.le;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.ironsource.G5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class yu extends lh {
    public mwh ouw;

    public final void ouw(JSONObject jSONObject) {
        this.ouw = mwh.ouw(bly.ouw("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }

    private static byte[] yu(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes(G5.N));
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e10) {
                                ko.fkw("PostExecutor", e10.toString());
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e11) {
                            e = e11;
                            gZIPOutputStream = gZIPOutputStream2;
                            ko.fkw("PostExecutor", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e12) {
                                    ko.fkw("PostExecutor", e12.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e13) {
                                    ko.fkw("PostExecutor", e13.toString());
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e14) {
                                ko.fkw("PostExecutor", e14.toString());
                                throw th;
                            }
                        }
                    } catch (IOException e15) {
                        e = e15;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e16) {
                ko.fkw("PostExecutor", e16.toString());
            }
        } catch (IOException e17) {
            e = e17;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        return byteArray;
    }

    public yu(cf cfVar) {
        super(cfVar);
        this.ouw = null;
    }

    public final void lh(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.ouw = mwh.ouw(bly.ouw("application/json; charset=utf-8"), str);
    }

    public final void ouw(String str, byte[] bArr) {
        this.ouw = new mwh(bly.ouw(str), bArr, mwh.ouw.BYTE_ARRAY_TYPE);
    }

    public final void ouw(final com.bytedance.sdk.component.ra.ouw.ouw ouwVar) {
        try {
            ryl.ouw ouwVar2 = new ryl.ouw();
            if (TextUtils.isEmpty(this.bly)) {
                ouwVar.ouw(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.f11910le)) {
                ouwVar2.pno = this.f11910le;
            }
            int i10 = this.f11911ra;
            if (i10 > 0) {
                ouwVar2.f11958ra = i10;
            }
            ouwVar2.ouw(this.bly);
            if (this.ouw == null) {
                ouwVar.ouw(this, new IOException("RequestBody is null, content type is not support!!"));
                return;
            }
            ouw(ouwVar2);
            ouwVar2.fkw = yu();
            this.yu.ouw(ouwVar2.ouw("POST", this.ouw).ouw()).ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bytedance.sdk.component.ra.vt.yu.1
                @Override // com.bytedance.sdk.component.vt.ouw.lh
                public final void ouw(IOException iOException) {
                    com.bytedance.sdk.component.ra.ouw.ouw ouwVar3 = ouwVar;
                    if (ouwVar3 != null) {
                        ouwVar3.ouw(yu.this, iOException);
                    }
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.bytedance.sdk.component.vt.ouw.lh
                public final void ouw(jg jgVar) throws IOException {
                    com.bytedance.sdk.component.ra.vt vtVar;
                    com.bytedance.sdk.component.ra.ouw.ouw ouwVar3 = ouwVar;
                    if (ouwVar3 != null) {
                        if (jgVar == null) {
                            ouwVar3.ouw(yu.this, new IOException("No response"));
                            return;
                        }
                        com.bytedance.sdk.component.ra.vt vtVar2 = null;
                        IOException iOException = null;
                        try {
                            HashMap map = new HashMap();
                            le leVarFkw = jgVar.fkw();
                            for (int i11 = 0; i11 < leVarFkw.ouw.length / 2; i11++) {
                                String strOuw = leVarFkw.ouw(i11);
                                String strVt = leVarFkw.vt(i11);
                                map.put(strOuw, strVt);
                                if (strOuw != null && strOuw.equalsIgnoreCase("content-type")) {
                                    map.put("content-type", strVt == null ? "" : strVt.toLowerCase());
                                }
                            }
                            com.bytedance.sdk.component.vt.ouw.ko koVarYu = jgVar.yu();
                            if (com.bytedance.sdk.component.ra.lh.ouw.ouw(map)) {
                                byte[] bArrYu = koVarYu.yu();
                                vtVar = new com.bytedance.sdk.component.ra.vt(jgVar.vt(), jgVar.ouw(), jgVar.lh(), map, null, 0L, 0L);
                                try {
                                    vtVar.bly = bArrYu;
                                } catch (Throwable th2) {
                                    th = th2;
                                    vtVar2 = vtVar;
                                    vtVar = vtVar2;
                                    iOException = new IOException(th);
                                }
                            } else if (yu.this.tlj) {
                                byte[] bArrYu2 = koVarYu.yu();
                                com.bytedance.sdk.component.ra.vt vtVar3 = new com.bytedance.sdk.component.ra.vt(jgVar.vt(), jgVar.ouw(), jgVar.lh(), map, new String(bArrYu2, yu.ouw(yu.ouw(koVarYu))), 0L, 0L);
                                try {
                                    vtVar3.bly = bArrYu2;
                                    vtVar = vtVar3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    vtVar2 = vtVar3;
                                    vtVar = vtVar2;
                                    iOException = new IOException(th);
                                }
                            } else if (koVarYu != null) {
                                vtVar = new com.bytedance.sdk.component.ra.vt(jgVar.vt(), jgVar.ouw(), jgVar.lh(), map, koVarYu.vt(), 0L, 0L);
                            } else {
                                throw new IOException(jgVar.lh());
                            }
                            yu.ouw(vtVar, jgVar);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (vtVar != null) {
                            ouwVar.ouw(yu.this, vtVar);
                            return;
                        }
                        com.bytedance.sdk.component.ra.ouw.ouw ouwVar4 = ouwVar;
                        if (ouwVar4 instanceof com.bytedance.sdk.component.ra.ouw.vt) {
                            com.bytedance.sdk.component.ra.ouw.vt vtVar4 = (com.bytedance.sdk.component.ra.ouw.vt) ouwVar4;
                            yu yuVar = yu.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            vtVar4.ouw(yuVar, iOException, new com.bytedance.sdk.component.ra.vt(jgVar.vt(), jgVar.ouw(), jgVar.lh(), null, null, 0L, 0L));
                            return;
                        }
                        yu yuVar2 = yu.this;
                        if (iOException == null) {
                            iOException = new IOException("Unexpected exception");
                        }
                        ouwVar4.ouw(yuVar2, iOException);
                    }
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
            ouwVar.ouw(this, new IOException(th2.getMessage()));
        }
    }

    public final com.bytedance.sdk.component.ra.vt ouw() {
        com.bytedance.sdk.component.ra.vt vtVar;
        try {
            ryl.ouw ouwVar = new ryl.ouw();
            if (TextUtils.isEmpty(this.bly)) {
                com.bytedance.sdk.component.ra.lh.yu.ouw("PostExecutor", "execute: Url is Empty");
                return new com.bytedance.sdk.component.ra.vt(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            ouwVar.ouw(this.bly);
            if (this.ouw == null) {
                com.bytedance.sdk.component.ra.lh.yu.ouw("PostExecutor", "RequestBody is null, content type is not support!!");
                return new com.bytedance.sdk.component.ra.vt(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            ouw(ouwVar);
            ouwVar.fkw = yu();
            jg jgVarVt = this.yu.ouw(ouwVar.ouw("POST", this.ouw).ouw()).vt();
            if (jgVarVt == null) {
                return null;
            }
            HashMap map = new HashMap();
            le leVarFkw = jgVarVt.fkw();
            for (int i10 = 0; i10 < leVarFkw.ouw.length / 2; i10++) {
                String strOuw = leVarFkw.ouw(i10);
                String strVt = leVarFkw.vt(i10);
                map.put(strOuw, strVt);
                if (strOuw != null && strOuw.equalsIgnoreCase("content-type")) {
                    map.put("content-type", strVt == null ? "" : strVt.toLowerCase());
                }
            }
            com.bytedance.sdk.component.vt.ouw.ko koVarYu = jgVarVt.yu();
            if (com.bytedance.sdk.component.ra.lh.ouw.ouw(map)) {
                byte[] bArrYu = koVarYu.yu();
                vtVar = new com.bytedance.sdk.component.ra.vt(jgVarVt.vt(), jgVarVt.ouw(), jgVarVt.lh(), map, null, 0L, 0L);
                vtVar.bly = bArrYu;
            } else if (this.tlj) {
                byte[] bArrYu2 = koVarYu.yu();
                com.bytedance.sdk.component.ra.vt vtVar2 = new com.bytedance.sdk.component.ra.vt(jgVarVt.vt(), jgVarVt.ouw(), jgVarVt.lh(), map, new String(bArrYu2, ouw(ouw(koVarYu))), 0L, 0L);
                vtVar2.bly = bArrYu2;
                vtVar = vtVar2;
            } else if (koVarYu != null) {
                vtVar = new com.bytedance.sdk.component.ra.vt(jgVarVt.vt(), jgVarVt.ouw(), jgVarVt.lh(), map, koVarYu.vt(), 0L, 0L);
            } else {
                throw new IOException(jgVarVt.lh());
            }
            ouw(vtVar, jgVarVt);
            return vtVar;
        } catch (Throwable th2) {
            return new com.bytedance.sdk.component.ra.vt(false, 5001, th2.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public final void ouw(String str, boolean z10) {
        if (z10) {
            ouw("application/json; charset=utf-8", yu(str));
            vt("Content-Encoding", "gzip");
        } else {
            lh(str);
        }
    }

    public static Charset ouw(bly blyVar) {
        try {
            return blyVar != null ? blyVar.ouw(com.bytedance.sdk.component.vt.ouw.vt.bly.ouw) : com.bytedance.sdk.component.vt.ouw.vt.bly.ouw;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.vt.ouw.vt.bly.ouw;
        }
    }

    public static bly ouw(com.bytedance.sdk.component.vt.ouw.ko koVar) {
        try {
            return koVar.fkw();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void ouw(com.bytedance.sdk.component.ra.vt vtVar, jg jgVar) {
        if (jgVar != null) {
            vtVar.tlj = jgVar.le();
        }
    }
}
