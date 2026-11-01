package yads;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yads.on0;
import yads.wx0;

/* JADX INFO: loaded from: classes9.dex */
public final class wx0 implements on0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mn0 f84372d = new mn0() { // from class: cp.ic
        @Override // yads.mn0
        public final on0 a(UUID uuid) {
            return wx0.b(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f84373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f84374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84375c;

    public static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override // yads.on0
    public final int b() {
        return 2;
    }

    @Override // yads.on0
    public final void b(byte[] bArr) {
        this.f84374b.closeSession(bArr);
    }

    @Override // yads.on0
    public final byte[] c() {
        return this.f84374b.openSession();
    }

    @Override // yads.on0
    public final k20 d(byte[] bArr) {
        return new ux0(a(this.f84373a), bArr, ib3.f78556a < 21 && jr.f79152d.equals(this.f84373a) && "L3".equals(this.f84374b.getPropertyString("securityLevel")));
    }

    @Override // yads.on0
    public final synchronized void release() {
        int i10 = this.f84375c - 1;
        this.f84375c = i10;
        if (i10 == 0) {
            this.f84374b.release();
        }
    }

    public static /* synthetic */ on0 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (la3 unused) {
            ih1.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new yk0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x0209  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0211  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:90:0x0234  */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x0219, please report this as an issue */
    @Override // yads.on0
    public final kn0 a(byte[] bArr, List list, int i10, HashMap map) throws NotProvisionedException {
        jk0 jk0Var;
        byte[] bArr2;
        String str;
        int i11;
        jk0 jk0Var2;
        dl2 dl2VarA;
        int i12;
        int i13;
        byte[] bArr3;
        dl2 dl2VarA2;
        byte[] bArr4;
        if (list != null) {
            if (!jr.f79152d.equals(this.f84373a)) {
                jk0Var2 = (jk0) list.get(0);
            } else if (ib3.f78556a < 28 || list.size() <= 1) {
                i11 = 0;
                while (true) {
                    if (i11 < list.size()) {
                        jk0Var2 = (jk0) list.get(0);
                        break;
                    }
                    jk0 jk0Var3 = (jk0) list.get(i11);
                    byte[] bArr5 = jk0Var3.f79080f;
                    bArr5.getClass();
                    dl2VarA = el2.a(bArr5);
                    if (dl2VarA == null) {
                        i12 = -1;
                    } else {
                        i12 = dl2VarA.f76722b;
                    }
                    i13 = ib3.f78556a;
                    if ((i13 >= 23 && i12 == 0) || (i13 >= 23 && i12 == 1)) {
                        jk0Var2 = jk0Var3;
                        break;
                    }
                }
            } else {
                jk0 jk0Var4 = (jk0) list.get(0);
                int i14 = 0;
                int length = 0;
                while (true) {
                    if (i14 < list.size()) {
                        jk0 jk0Var5 = (jk0) list.get(i14);
                        byte[] bArr6 = jk0Var5.f79080f;
                        bArr6.getClass();
                        if (!ib3.a(jk0Var5.f79079e, jk0Var4.f79079e) || !ib3.a(jk0Var5.f79078d, jk0Var4.f79078d) || el2.a(bArr6) == null) {
                            i11 = 0;
                            while (true) {
                                if (i11 < list.size()) {
                                    jk0Var2 = (jk0) list.get(0);
                                    break;
                                }
                                jk0 jk0Var6 = (jk0) list.get(i11);
                                byte[] bArr7 = jk0Var6.f79080f;
                                bArr7.getClass();
                                dl2VarA = el2.a(bArr7);
                                if (dl2VarA == null) {
                                    i12 = -1;
                                } else {
                                    i12 = dl2VarA.f76722b;
                                }
                                i13 = ib3.f78556a;
                                i11 = i13 >= 23 ? i11 + 1 : i11 + 1;
                                jk0Var2 = jk0Var6;
                                break;
                            }
                        }
                        length += bArr6.length;
                        i14++;
                    } else {
                        byte[] bArr8 = new byte[length];
                        int i15 = 0;
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            byte[] bArr9 = ((jk0) list.get(i16)).f79080f;
                            bArr9.getClass();
                            int length2 = bArr9.length;
                            System.arraycopy(bArr9, 0, bArr8, i15, length2);
                            i15 += length2;
                        }
                        jk0Var2 = new jk0(jk0Var4.f79077c, jk0Var4.f79078d, jk0Var4.f79079e, bArr8);
                    }
                }
            }
            UUID uuid = this.f84373a;
            byte[] bArrA = jk0Var2.f79080f;
            bArrA.getClass();
            UUID uuid2 = jr.f79153e;
            if (uuid2.equals(uuid)) {
                dl2 dl2VarA3 = el2.a(bArrA);
                if (dl2VarA3 == null) {
                    bArr4 = null;
                } else if (uuid.equals(dl2VarA3.f76721a)) {
                    bArr4 = dl2VarA3.f76723c;
                } else {
                    ih1.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + dl2VarA3.f76721a + ".");
                    bArr4 = null;
                }
                if (bArr4 != null) {
                    bArrA = bArr4;
                }
                jb2 jb2Var = new jb2(bArrA);
                int iD = jb2Var.d();
                short sF = jb2Var.f();
                short sF2 = jb2Var.f();
                if (sF == 1 && sF2 == 1) {
                    short sF3 = jb2Var.f();
                    Charset charset = bu.f75965d;
                    String strA = jb2Var.a(sF3, charset);
                    if (!strA.contains("<LA_URL>")) {
                        int iIndexOf = strA.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            ih1.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strA.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strA.substring(iIndexOf);
                        int i17 = iD + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i17);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i17);
                        byteBufferAllocate.putShort(sF);
                        byteBufferAllocate.putShort(sF2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrA = byteBufferAllocate.array();
                    }
                } else {
                    ih1.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr3 = null;
                bArrA = el2.a(uuid2, null, bArrA);
            } else {
                jk0Var2 = jk0Var2;
                bArr3 = null;
            }
            int i18 = ib3.f78556a;
            if (i18 >= 23 || !jr.f79152d.equals(uuid)) {
                if (uuid2.equals(uuid)) {
                    byte[] bArrDecode = Base64.decode("QW1hem9u", 0);
                    Charset charset2 = lk.c.f63591b;
                    if (new String(bArrDecode, charset2).equals(ib3.f78558c)) {
                        String str3 = new String(Base64.decode("QUZUQg==", 0), charset2);
                        String str4 = ib3.f78559d;
                        if (str3.equals(str4) || new String(Base64.decode("QUZUUw==", 0), charset2).equals(str4) || new String(Base64.decode("QUZUTQ==", 0), charset2).equals(str4) || new String(Base64.decode("QUZUVA==", 0), charset2).equals(str4)) {
                            dl2VarA2 = el2.a(bArrA);
                            if (dl2VarA2 != null) {
                                bArr2 = bArr3;
                            } else if (uuid.equals(dl2VarA2.f76721a)) {
                                bArr2 = dl2VarA2.f76723c;
                            } else {
                                ih1.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + dl2VarA2.f76721a + ".");
                                bArr2 = bArr3;
                            }
                            if (bArr2 == null) {
                            }
                        }
                    }
                }
                bArr2 = bArrA;
            } else {
                dl2VarA2 = el2.a(bArrA);
                if (dl2VarA2 != null) {
                    bArr2 = bArr3;
                } else if (uuid.equals(dl2VarA2.f76721a)) {
                    ih1.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + dl2VarA2.f76721a + ".");
                    bArr2 = bArr3;
                } else {
                    bArr2 = dl2VarA2.f76723c;
                }
                if (bArr2 == null) {
                    bArr2 = bArrA;
                }
            }
            UUID uuid3 = this.f84373a;
            jk0 jk0Var7 = jk0Var2;
            String str5 = jk0Var7.f79079e;
            str = (i18 < 26 && jr.f79151c.equals(uuid3) && ("video/mp4".equals(str5) || "audio/mp4".equals(str5))) ? "cenc" : str5;
            jk0Var = jk0Var7;
        } else {
            jk0Var = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f84374b.getKeyRequest(bArr, bArr2, str, i10, map);
        UUID uuid4 = this.f84373a;
        byte[] data = keyRequest.getData();
        if (jr.f79151c.equals(uuid4) && ib3.f78556a < 27) {
            Charset charset3 = bu.f75964c;
            data = new String(data, charset3).replace('+', '-').replace('/', '_').getBytes(charset3);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && jk0Var != null && !TextUtils.isEmpty(jk0Var.f79078d)) {
            defaultUrl = jk0Var.f79078d;
        }
        if (ib3.f78556a >= 23) {
            keyRequest.getRequestType();
        }
        return new kn0(defaultUrl, data);
    }

    @Override // yads.on0
    public final void c(byte[] bArr) throws DeniedByServerException {
        this.f84374b.provideProvisionResponse(bArr);
    }

    public wx0(UUID uuid) {
        ni.a(uuid);
        ni.a("Use C.CLEARKEY_UUID instead", !jr.f79150b.equals(uuid));
        this.f84373a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f84374b = mediaDrm;
        this.f84375c = 1;
        if (jr.f79152d.equals(uuid) && d()) {
            a(mediaDrm);
        }
    }

    public static wx0 c(UUID uuid) throws la3 {
        try {
            return new wx0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new la3(e10);
        } catch (Exception e11) {
            throw new la3(e11);
        }
    }

    @Override // yads.on0
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (jr.f79151c.equals(this.f84373a) && ib3.f78556a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, bu.f75964c));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(StringUtils.COMMA);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K).replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(bu.f75964c);
            } catch (JSONException e10) {
                ih1.b("ClearKeyUtil", ih1.a("Failed to adjust response data: ".concat(new String(bArr2, bu.f75964c)), e10));
            }
        }
        return this.f84374b.provideKeyResponse(bArr, bArr2);
    }

    public static boolean d() {
        return pk2.f81443f.a().equals(ib3.f78559d);
    }

    @Override // yads.on0
    public final nn0 a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f84374b.getProvisionRequest();
        return new nn0(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    public final void a(ln0 ln0Var, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bd0 bd0Var = ((ad0) ln0Var).f75479a.f77764y;
        bd0Var.getClass();
        bd0Var.obtainMessage(i10, bArr).sendToTarget();
    }

    @Override // yads.on0
    public final Map a(byte[] bArr) {
        return this.f84374b.queryKeyStatus(bArr);
    }

    @Override // yads.on0
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f84374b.restoreKeys(bArr, bArr2);
    }

    @Override // yads.on0
    public final void a(final ad0 ad0Var) {
        this.f84374b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: cp.jc
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                this.f51397a.a(ad0Var, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // yads.on0
    public final void a(byte[] bArr, ye2 ye2Var) {
        if (ib3.f78556a >= 31) {
            try {
                vx0.a(this.f84374b, bArr, ye2Var);
            } catch (UnsupportedOperationException unused) {
                ih1.d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // yads.on0
    public final boolean a(String str, byte[] bArr) {
        if (ib3.f78556a >= 31) {
            return vx0.a(this.f84374b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f84373a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public static UUID a(UUID uuid) {
        return (ib3.f78556a >= 27 || !jr.f79151c.equals(uuid)) ? uuid : jr.f79150b;
    }
}
