package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4654xm extends MessageNano {
    public static final int D = -1;
    public static final int E = 0;
    public static final int F = 1;
    public static volatile C4654xm[] G;
    public C4604vm A;
    public C4554tm[] B;
    public C4504rm C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f57946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f57947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f57948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f57949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f57950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f57951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f57952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C4480qm[] f57953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C4529sm f57954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f57955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f57956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f57957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f57958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f57959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f57960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C4629wm f57961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f57962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f57963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f57964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f57965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f57966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C4579um f57967v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f57968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f57969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C4455pm f57970y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C4430om f57971z;

    public static C4654xm[] b() {
        if (G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (G == null) {
                    G = new C4654xm[0];
                }
            }
        }
        return G;
    }

    public final C4654xm a() {
        this.f57946a = "";
        this.f57947b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f57948c = strArr;
        this.f57949d = "";
        this.f57950e = "";
        this.f57951f = strArr;
        this.f57952g = strArr;
        this.f57953h = C4480qm.b();
        this.f57954i = null;
        this.f57955j = "";
        this.f57956k = "";
        this.f57957l = "";
        this.f57958m = false;
        this.f57959n = "";
        this.f57960o = strArr;
        this.f57961p = null;
        this.f57962q = false;
        this.f57963r = "";
        this.f57964s = 0L;
        this.f57965t = 0L;
        this.f57966u = false;
        this.f57967v = null;
        this.f57968w = 600;
        this.f57969x = 1;
        this.f57970y = null;
        this.f57971z = null;
        this.A = null;
        this.B = C4554tm.b();
        this.C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f57946a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f57946a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f57947b);
        String[] strArr = this.f57948c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f57948c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i11++;
            }
        }
        if (!this.f57949d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f57949d);
        }
        if (!this.f57950e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f57950e);
        }
        String[] strArr3 = this.f57951f;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr4 = this.f57951f;
                if (i12 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i12];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i12++;
            }
        }
        String[] strArr5 = this.f57952g;
        if (strArr5 != null && strArr5.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr6 = this.f57952g;
                if (i13 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i13];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i13++;
            }
        }
        C4480qm[] c4480qmArr = this.f57953h;
        if (c4480qmArr != null && c4480qmArr.length > 0) {
            int i14 = 0;
            while (true) {
                C4480qm[] c4480qmArr2 = this.f57953h;
                if (i14 >= c4480qmArr2.length) {
                    break;
                }
                C4480qm c4480qm = c4480qmArr2[i14];
                if (c4480qm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c4480qm);
                }
                i14++;
            }
        }
        C4529sm c4529sm = this.f57954i;
        if (c4529sm != null) {
            codedOutputByteBufferNano.writeMessage(9, c4529sm);
        }
        if (!this.f57955j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f57955j);
        }
        if (!this.f57956k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f57956k);
        }
        if (!this.f57957l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f57957l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f57958m);
        if (!this.f57959n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f57959n);
        }
        String[] strArr7 = this.f57960o;
        if (strArr7 != null && strArr7.length > 0) {
            int i15 = 0;
            while (true) {
                String[] strArr8 = this.f57960o;
                if (i15 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i15];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i15++;
            }
        }
        C4629wm c4629wm = this.f57961p;
        if (c4629wm != null) {
            codedOutputByteBufferNano.writeMessage(16, c4629wm);
        }
        boolean z10 = this.f57962q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        if (!this.f57963r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f57963r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f57964s);
        codedOutputByteBufferNano.writeInt64(22, this.f57965t);
        boolean z11 = this.f57966u;
        if (z11) {
            codedOutputByteBufferNano.writeBool(23, z11);
        }
        C4579um c4579um = this.f57967v;
        if (c4579um != null) {
            codedOutputByteBufferNano.writeMessage(24, c4579um);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f57968w);
        codedOutputByteBufferNano.writeInt32(26, this.f57969x);
        C4455pm c4455pm = this.f57970y;
        if (c4455pm != null) {
            codedOutputByteBufferNano.writeMessage(27, c4455pm);
        }
        C4430om c4430om = this.f57971z;
        if (c4430om != null) {
            codedOutputByteBufferNano.writeMessage(29, c4430om);
        }
        C4604vm c4604vm = this.A;
        if (c4604vm != null) {
            codedOutputByteBufferNano.writeMessage(30, c4604vm);
        }
        C4554tm[] c4554tmArr = this.B;
        if (c4554tmArr != null && c4554tmArr.length > 0) {
            while (true) {
                C4554tm[] c4554tmArr2 = this.B;
                if (i10 >= c4554tmArr2.length) {
                    break;
                }
                C4554tm c4554tm = c4554tmArr2[i10];
                if (c4554tm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c4554tm);
                }
                i10++;
            }
        }
        C4504rm c4504rm = this.C;
        if (c4504rm != null) {
            codedOutputByteBufferNano.writeMessage(32, c4504rm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public C4654xm() {
        a();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f57946a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f57946a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f57947b) + iComputeSerializedSize;
        String[] strArr = this.f57948c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            int iComputeStringSizeNoTag = 0;
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.f57948c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    i12++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i11++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i12;
        }
        if (!this.f57949d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f57949d);
        }
        if (!this.f57950e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f57950e);
        }
        String[] strArr3 = this.f57951f;
        if (strArr3 != null && strArr3.length > 0) {
            int i13 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr4 = this.f57951f;
                if (i13 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i13];
                if (str2 != null) {
                    i14++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i13++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i14;
        }
        String[] strArr5 = this.f57952g;
        if (strArr5 != null && strArr5.length > 0) {
            int i15 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i16 = 0;
            while (true) {
                String[] strArr6 = this.f57952g;
                if (i15 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i15];
                if (str3 != null) {
                    i16++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i15++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i16;
        }
        C4480qm[] c4480qmArr = this.f57953h;
        if (c4480qmArr != null && c4480qmArr.length > 0) {
            int i17 = 0;
            while (true) {
                C4480qm[] c4480qmArr2 = this.f57953h;
                if (i17 >= c4480qmArr2.length) {
                    break;
                }
                C4480qm c4480qm = c4480qmArr2[i17];
                if (c4480qm != null) {
                    iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(8, c4480qm);
                }
                i17++;
            }
        }
        C4529sm c4529sm = this.f57954i;
        if (c4529sm != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c4529sm);
        }
        if (!this.f57955j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f57955j);
        }
        if (!this.f57956k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f57956k);
        }
        if (!this.f57957l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f57957l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f57958m) + iComputeInt64Size;
        if (!this.f57959n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f57959n);
        }
        String[] strArr7 = this.f57960o;
        if (strArr7 != null && strArr7.length > 0) {
            int i18 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr8 = this.f57960o;
                if (i18 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i18];
                if (str4 != null) {
                    i19++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i18++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag4 + i19;
        }
        C4629wm c4629wm = this.f57961p;
        if (c4629wm != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c4629wm);
        }
        boolean z10 = this.f57962q;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        if (!this.f57963r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f57963r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f57965t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f57964s) + iComputeBoolSize;
        boolean z11 = this.f57966u;
        if (z11) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z11);
        }
        C4579um c4579um = this.f57967v;
        if (c4579um != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c4579um);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f57969x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f57968w) + iComputeInt64Size2;
        C4455pm c4455pm = this.f57970y;
        if (c4455pm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c4455pm);
        }
        C4430om c4430om = this.f57971z;
        if (c4430om != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c4430om);
        }
        C4604vm c4604vm = this.A;
        if (c4604vm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c4604vm);
        }
        C4554tm[] c4554tmArr = this.B;
        if (c4554tmArr != null && c4554tmArr.length > 0) {
            while (true) {
                C4554tm[] c4554tmArr2 = this.B;
                if (i10 >= c4554tmArr2.length) {
                    break;
                }
                C4554tm c4554tm = c4554tmArr2[i10];
                if (c4554tm != null) {
                    iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(31, c4554tm);
                }
                i10++;
            }
        }
        C4504rm c4504rm = this.C;
        if (c4504rm != null) {
            return iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c4504rm);
        }
        return iComputeInt32Size;
    }

    public static C4654xm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4654xm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4654xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f57946a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f57947b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f57948c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i10];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f57948c = strArr2;
                    break;
                case 34:
                    this.f57949d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f57950e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f57951f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i11 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i11];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f57951f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f57952g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i12 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i12];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i12 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f57952g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C4480qm[] c4480qmArr = this.f57953h;
                    int length4 = c4480qmArr == null ? 0 : c4480qmArr.length;
                    int i13 = repeatedFieldArrayLength4 + length4;
                    C4480qm[] c4480qmArr2 = new C4480qm[i13];
                    if (length4 != 0) {
                        System.arraycopy(c4480qmArr, 0, c4480qmArr2, 0, length4);
                    }
                    while (length4 < i13 - 1) {
                        C4480qm c4480qm = new C4480qm();
                        c4480qmArr2[length4] = c4480qm;
                        codedInputByteBufferNano.readMessage(c4480qm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C4480qm c4480qm2 = new C4480qm();
                    c4480qmArr2[length4] = c4480qm2;
                    codedInputByteBufferNano.readMessage(c4480qm2);
                    this.f57953h = c4480qmArr2;
                    break;
                case 74:
                    if (this.f57954i == null) {
                        this.f57954i = new C4529sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f57954i);
                    break;
                case 82:
                    this.f57955j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.f57956k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f57957l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f57958m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f57959n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f57960o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i14 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i14];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i14 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f57960o = strArr8;
                    break;
                case 130:
                    if (this.f57961p == null) {
                        this.f57961p = new C4629wm();
                    }
                    codedInputByteBufferNano.readMessage(this.f57961p);
                    break;
                case 136:
                    this.f57962q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f57963r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f57964s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f57965t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f57966u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f57967v == null) {
                        this.f57967v = new C4579um();
                    }
                    codedInputByteBufferNano.readMessage(this.f57967v);
                    break;
                case 200:
                    this.f57968w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f57969x = codedInputByteBufferNano.readInt32();
                    break;
                case MRAID_JS_DOES_NOT_EXIST_VALUE:
                    if (this.f57970y == null) {
                        this.f57970y = new C4455pm();
                    }
                    codedInputByteBufferNano.readMessage(this.f57970y);
                    break;
                case 234:
                    if (this.f57971z == null) {
                        this.f57971z = new C4430om();
                    }
                    codedInputByteBufferNano.readMessage(this.f57971z);
                    break;
                case 242:
                    if (this.A == null) {
                        this.A = new C4604vm();
                    }
                    codedInputByteBufferNano.readMessage(this.A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C4554tm[] c4554tmArr = this.B;
                    int length6 = c4554tmArr == null ? 0 : c4554tmArr.length;
                    int i15 = repeatedFieldArrayLength6 + length6;
                    C4554tm[] c4554tmArr2 = new C4554tm[i15];
                    if (length6 != 0) {
                        System.arraycopy(c4554tmArr, 0, c4554tmArr2, 0, length6);
                    }
                    while (length6 < i15 - 1) {
                        C4554tm c4554tm = new C4554tm();
                        c4554tmArr2[length6] = c4554tm;
                        codedInputByteBufferNano.readMessage(c4554tm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C4554tm c4554tm2 = new C4554tm();
                    c4554tmArr2[length6] = c4554tm2;
                    codedInputByteBufferNano.readMessage(c4554tm2);
                    this.B = c4554tmArr2;
                    break;
                case 258:
                    if (this.C == null) {
                        this.C = new C4504rm();
                    }
                    codedInputByteBufferNano.readMessage(this.C);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    public static C4654xm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4654xm) MessageNano.mergeFrom(new C4654xm(), bArr);
    }
}
