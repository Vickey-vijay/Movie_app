package io.bidmachine.util;

import bk.a;
import ck.p;
import kotlin.Metadata;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: Tag.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lio/bidmachine/util/Tag;", "", "", "toString", "name", "Ljava/lang/String;", "tag$delegate", "Lmj/g;", "getTag", "()Ljava/lang/String;", "tag", "<init>", "(Ljava/lang/String;)V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class Tag {
    private final String name;

    /* JADX INFO: renamed from: tag$delegate, reason: from kotlin metadata */
    private final g tag;

    public Tag(String str) {
        p.j(str, "name");
        this.name = str;
        this.tag = b.a(new a<String>() { // from class: io.bidmachine.util.Tag$tag$2
            {
                super(0);
            }

            @Override // bk.a
            public final String invoke() {
                return this.this$0.name + " @" + UtilsKt.createHexHashCode(this.this$0);
            }
        });
    }

    private final String getTag() {
        return (String) this.tag.getValue();
    }

    public String toString() {
        return getTag();
    }
}
