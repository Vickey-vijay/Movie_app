package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f78953c;

    public j93(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f78951a = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f78952b = listUnmodifiableList;
        this.f78953c = bArr;
    }
}
