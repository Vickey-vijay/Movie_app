package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class j2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f18222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3 f18223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f18225d;

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final Object a() {
        return ((t0) this.f18222a.newBuilderForType()).b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean b(Object obj, Object obj2) {
        this.f18223b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        this.f18223b.getClass();
        if (!n3Var.equals(((z0) obj2).unknownFields)) {
            return false;
        }
        if (!this.f18224c) {
            return true;
        }
        this.f18225d.getClass();
        n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
        this.f18225d.getClass();
        return n0Var.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(Object obj) {
        this.f18223b.getClass();
        ((z0) obj).unknownFields.f18250e = false;
        this.f18225d.getClass();
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int d(Object obj) {
        this.f18223b.getClass();
        int iHashCode = ((z0) obj).unknownFields.hashCode();
        if (!this.f18224c) {
            return iHashCode;
        }
        this.f18225d.getClass();
        return (iHashCode * 53) + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.f18241a.hashCode();
    }

    public j2(o3 o3Var, j0 j0Var, d2 d2Var) {
        this.f18223b = o3Var;
        j0Var.getClass();
        this.f18224c = d2Var instanceof GeneratedMessageLite$ExtendableMessage;
        this.f18225d = j0Var;
        this.f18222a = d2Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, Object obj2) {
        o3 o3Var = this.f18223b;
        Class cls = u2.f18301a;
        o3Var.getClass();
        z0 z0Var = (z0) obj;
        n3 n3VarA = z0Var.unknownFields;
        n3 n3Var = ((z0) obj2).unknownFields;
        if (!n3Var.equals(n3.f18245f)) {
            n3VarA = n3.a(n3VarA, n3Var);
        }
        z0Var.unknownFields = n3VarA;
        if (this.f18224c) {
            this.f18225d.getClass();
            n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (n0Var.f18241a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int b(Object obj) {
        this.f18223b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        int i10 = n3Var.f18249d;
        if (i10 == -1) {
            int iA = 0;
            for (int i11 = 0; i11 < n3Var.f18246a; i11++) {
                int i12 = n3Var.f18247b[i11] >>> 3;
                iA += b0.a((s) n3Var.f18248c[i11]) + b0.b(3) + b0.c(i12) + b0.b(2) + (b0.b(1) * 2);
            }
            n3Var.f18249d = iA;
            i10 = iA;
        }
        if (!this.f18224c) {
            return i10;
        }
        this.f18225d.getClass();
        return i10 + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, c0 c0Var) {
        this.f18225d.getClass();
        Iterator itD = ((GeneratedMessageLite$ExtendableMessage) obj).extensions.d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            w0 w0Var = (w0) entry.getKey();
            if (w0Var.f18319c.a() == k4.MESSAGE && !w0Var.f18320d && !w0Var.f18321e) {
                int i10 = w0Var.f18318b;
                Object value = entry.getValue();
                c0Var.getClass();
                if (value instanceof s) {
                    c0Var.f18158a.b(i10, (s) value);
                } else {
                    c0Var.f18158a.a(i10, (d2) value);
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        this.f18223b.getClass();
        n3 n3Var = ((z0) obj).unknownFields;
        n3Var.getClass();
        c0Var.getClass();
        if (q4.ASCENDING == q4.DESCENDING) {
            for (int i11 = n3Var.f18246a - 1; i11 >= 0; i11--) {
                int i12 = n3Var.f18247b[i11] >>> 3;
                Object obj2 = n3Var.f18248c[i11];
                if (obj2 instanceof s) {
                    c0Var.f18158a.b(i12, (s) obj2);
                } else {
                    c0Var.f18158a.a(i12, (d2) obj2);
                }
            }
            return;
        }
        for (int i13 = 0; i13 < n3Var.f18246a; i13++) {
            int i14 = n3Var.f18247b[i13] >>> 3;
            Object obj3 = n3Var.f18248c[i13];
            if (obj3 instanceof s) {
                c0Var.f18158a.b(i14, (s) obj3);
            } else {
                c0Var.f18158a.a(i14, (d2) obj3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, byte[] bArr, int i10, int i11, f fVar) throws n1 {
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        if (n3Var == n3.f18245f) {
            n3Var = new n3();
            z0Var.unknownFields = n3Var;
        }
        n0 n0VarEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        x0 x0VarA = null;
        while (i10 < i11) {
            int iD = g.d(bArr, i10, fVar);
            int i12 = fVar.f18180a;
            if (i12 == 11) {
                int i13 = 0;
                s sVar = null;
                while (iD < i11) {
                    int iA = iD + 1;
                    byte b10 = bArr[iD];
                    if (b10 >= 0) {
                        fVar.f18180a = b10;
                    } else {
                        iA = g.a(b10, bArr, iA, fVar);
                    }
                    int i14 = fVar.f18180a;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 != 2) {
                        if (i15 == 3) {
                            if (x0VarA != null) {
                                iD = g.a(p2.f18255c.a(x0VarA.f18333c.getClass()), bArr, iA, i11, fVar);
                                n0VarEnsureExtensionsAreMutable.c(x0VarA.f18334d, fVar.f18182c);
                            } else if (i16 == 2) {
                                iD = g.a(bArr, iA, fVar);
                                sVar = (s) fVar.f18182c;
                            }
                        }
                        if (i14 == 12) {
                            iD = iA;
                            break;
                        }
                        iD = g.a(i14, bArr, iA, i11, fVar);
                    } else if (i16 == 0) {
                        int iA2 = iA + 1;
                        byte b11 = bArr[iA];
                        if (b11 >= 0) {
                            fVar.f18180a = b11;
                        } else {
                            iA2 = g.a(b11, bArr, iA2, fVar);
                        }
                        iD = iA2;
                        i13 = fVar.f18180a;
                        j0 j0Var = this.f18225d;
                        h0 h0Var = fVar.f18183d;
                        d2 d2Var = this.f18222a;
                        j0Var.getClass();
                        x0VarA = h0Var.a(i13, d2Var);
                    } else {
                        if (i14 == 12) {
                            iD = iA;
                            break;
                        }
                        iD = g.a(i14, bArr, iA, i11, fVar);
                    }
                }
                if (sVar != null) {
                    n3Var.a((i13 << 3) | 2, sVar);
                }
                i10 = iD;
            } else if ((i12 & 7) == 2) {
                j0 j0Var2 = this.f18225d;
                h0 h0Var2 = fVar.f18183d;
                d2 d2Var2 = this.f18222a;
                j0Var2.getClass();
                x0 x0VarA2 = h0Var2.a(i12 >>> 3, d2Var2);
                if (x0VarA2 != null) {
                    i10 = g.a(p2.f18255c.a(x0VarA2.f18333c.getClass()), bArr, iD, i11, fVar);
                    n0VarEnsureExtensionsAreMutable.c(x0VarA2.f18334d, fVar.f18182c);
                } else {
                    i10 = g.a(i12, bArr, iD, i11, n3Var, fVar);
                }
                x0VarA = x0VarA2;
            } else {
                i10 = g.a(i12, bArr, iD, i11, fVar);
            }
        }
        if (i10 != i11) {
            throw new n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, s2 s2Var, h0 h0Var) {
        o3 o3Var = this.f18223b;
        j0 j0Var = this.f18225d;
        o3Var.getClass();
        z0 z0Var = (z0) obj;
        n3 n3Var = z0Var.unknownFields;
        if (n3Var == n3.f18245f) {
            n3Var = new n3();
            z0Var.unknownFields = n3Var;
        }
        n3 n3Var2 = n3Var;
        j0Var.getClass();
        n0 n0VarEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (s2Var.s() != Integer.MAX_VALUE && a(s2Var, h0Var, j0Var, n0VarEnsureExtensionsAreMutable, o3Var, n3Var2)) {
            try {
            } finally {
                z0Var.unknownFields = n3Var2;
            }
        }
    }

    public final boolean a(s2 s2Var, h0 h0Var, j0 j0Var, n0 n0Var, o3 o3Var, n3 n3Var) throws n1 {
        byte[] bArr;
        int iE = s2Var.e();
        if (iE != 11) {
            if ((iE & 7) == 2) {
                d2 d2Var = this.f18222a;
                j0Var.getClass();
                x0 x0VarA = h0Var.a(iE >>> 3, d2Var);
                if (x0VarA != null) {
                    n0Var.c(x0VarA.f18334d, s2Var.b(x0VarA.f18333c.getClass(), h0Var));
                    return true;
                }
                o3Var.getClass();
                return o3.a((Object) n3Var, s2Var);
            }
            return s2Var.i();
        }
        int iC = 0;
        x0 x0VarA2 = null;
        s sVarA = null;
        while (s2Var.s() != Integer.MAX_VALUE) {
            int iE2 = s2Var.e();
            if (iE2 == 16) {
                iC = s2Var.c();
                d2 d2Var2 = this.f18222a;
                j0Var.getClass();
                x0VarA2 = h0Var.a(iC, d2Var2);
            } else if (iE2 == 26) {
                if (x0VarA2 != null) {
                    j0Var.getClass();
                    n0Var.c(x0VarA2.f18334d, s2Var.b(x0VarA2.f18333c.getClass(), h0Var));
                } else {
                    sVarA = s2Var.a();
                }
            } else if (!s2Var.i()) {
                break;
            }
        }
        if (s2Var.e() != 12) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
        if (sVarA != null) {
            if (x0VarA2 != null) {
                j0Var.getClass();
                z0 z0VarB = ((t0) x0VarA2.f18333c.newBuilderForType()).b();
                int size = sVarA.size();
                if (size == 0) {
                    bArr = l1.f18233b;
                } else {
                    byte[] bArr2 = new byte[size];
                    sVarA.a(size, bArr2);
                    bArr = bArr2;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                if (byteBufferWrap.hasArray()) {
                    h hVar = new h(byteBufferWrap);
                    p2 p2Var = p2.f18255c;
                    p2Var.getClass();
                    p2Var.a(z0VarB.getClass()).a(z0VarB, hVar, h0Var);
                    n0Var.c(x0VarA2.f18334d, z0VarB);
                    if (hVar.s() != Integer.MAX_VALUE) {
                        throw new n1("Protocol message end-group tag did not match expected tag.");
                    }
                } else {
                    throw new IllegalArgumentException("Direct buffers not yet supported");
                }
            } else {
                o3Var.getClass();
                n3Var.a((iC << 3) | 2, sVarA);
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean a(Object obj) {
        this.f18225d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.c();
    }
}
