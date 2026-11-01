package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4447pe implements InterfaceC4109c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4546te f57505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4310k3 f57506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4542ta f57507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Kf f57508d;

    public C4447pe() {
        this(new C4546te(), new C4310k3(), new C4542ta(100), new Kf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(@NonNull C4422oe c4422oe) {
        Ei eiFromModel;
        C4590v8 c4590v8 = new C4590v8();
        c4590v8.f57807a = c4422oe.f57435a;
        c4590v8.f57812f = new C4315k8();
        C4472qe c4472qe = c4422oe.f57436b;
        C4264i8 c4264i8 = new C4264i8();
        c4264i8.f56954a = StringUtils.getUTF8Bytes(c4472qe.f57565a);
        Nn nnA = this.f57507c.a(c4472qe.f57566b);
        c4264i8.f56955b = StringUtils.getUTF8Bytes((String) nnA.f55658a);
        c4264i8.f56958e = c4472qe.f57567c.size();
        Map<String, String> map = c4472qe.f57568d;
        if (map != null) {
            eiFromModel = this.f57505a.fromModel(map);
            c4264i8.f56956c = (C4366m8) eiFromModel.f55185a;
        } else {
            eiFromModel = null;
        }
        c4590v8.f57812f.f57083a = c4264i8;
        C4078b3 c4078b3 = new C4078b3(C4078b3.b(nnA, eiFromModel));
        List list = c4472qe.f57567c;
        ArrayList arrayList = new ArrayList();
        this.f57508d.getClass();
        int iComputeInt32Size = c4590v8.f57807a != new C4590v8().f57807a ? CodedOutputByteBufferNano.computeInt32Size(1, c4590v8.f57807a) : 0;
        C4565u8 c4565u8 = c4590v8.f57808b;
        if (c4565u8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c4565u8);
        }
        C4515s8 c4515s8 = c4590v8.f57809c;
        if (c4515s8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c4515s8);
        }
        C4540t8 c4540t8 = c4590v8.f57810d;
        int i10 = 4;
        if (c4540t8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c4540t8);
        }
        C4160e8 c4160e8 = c4590v8.f57811e;
        if (c4160e8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c4160e8);
        }
        C4315k8 c4315k8 = c4590v8.f57812f;
        if (c4315k8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c4315k8);
        }
        ArrayList arrayList2 = new ArrayList();
        C4590v8 c4590v9 = new C4590v8();
        c4590v9.f57807a = c4590v8.f57807a;
        C4315k8 c4315k9 = new C4315k8();
        c4590v9.f57812f = c4315k9;
        c4315k9.f57083a = new C4264i8();
        C4264i8 c4264i9 = c4590v9.f57812f.f57083a;
        C4264i8 c4264i10 = c4590v8.f57812f.f57083a;
        c4264i9.f56955b = c4264i10.f56955b;
        c4264i9.f56954a = c4264i10.f56954a;
        c4264i9.f56958e = c4264i10.f56958e;
        c4264i9.f56956c = c4264i10.f56956c;
        C4078b3 c4078b4 = c4078b3;
        int i11 = 0;
        int i12 = iComputeInt32Size;
        while (i11 < list.size()) {
            C4336l3 c4336l3 = (C4336l3) list.get(i11);
            C4289j8 c4289j8 = new C4289j8();
            c4289j8.f57006a = i11;
            Ei eiFromModel2 = this.f57506b.fromModel(c4336l3);
            c4289j8.f57007b = (C4186f8) eiFromModel2.f55185a;
            eiFromModel2.f55186b.getBytesTruncated();
            Ei ei2 = new Ei(c4289j8, eiFromModel2);
            Kf kf2 = this.f57508d;
            C4289j8 c4289j9 = (C4289j8) ei2.f55185a;
            kf2.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i10);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c4289j9);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i12 + iComputeRawVarint32Size > 204800) {
                c4590v9.f57812f.f57083a.f56957d = (C4289j8[]) arrayList2.toArray(new C4289j8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ei(c4590v9, c4078b4));
                C4590v8 c4590v10 = new C4590v8();
                c4590v10.f57807a = c4590v8.f57807a;
                C4315k8 c4315k10 = new C4315k8();
                c4590v10.f57812f = c4315k10;
                c4315k10.f57083a = new C4264i8();
                C4264i8 c4264i11 = c4590v10.f57812f.f57083a;
                C4264i8 c4264i12 = c4590v8.f57812f.f57083a;
                c4264i11.f56955b = c4264i12.f56955b;
                c4264i11.f56954a = c4264i12.f56954a;
                c4264i11.f56958e = c4264i12.f56958e;
                c4264i11.f56956c = c4264i12.f56956c;
                c4078b4 = c4078b3;
                i12 = iComputeInt32Size;
                c4590v9 = c4590v10;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C4289j8) ei2.f55185a);
            c4078b4 = new C4078b3(C4078b3.b(c4078b4, ei2.f55186b));
            i12 += iComputeRawVarint32Size;
            i11++;
            i10 = 4;
        }
        c4590v9.f57812f.f57083a.f56957d = (C4289j8[]) arrayList2.toArray(new C4289j8[arrayList2.size()]);
        arrayList.add(new Ei(c4590v9, c4078b4));
        return arrayList;
    }

    public C4447pe(C4546te c4546te, C4310k3 c4310k3, C4542ta c4542ta, Kf kf2) {
        this.f57505a = c4546te;
        this.f57506b = c4310k3;
        this.f57507c = c4542ta;
        this.f57508d = kf2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4422oe a(@NonNull List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
