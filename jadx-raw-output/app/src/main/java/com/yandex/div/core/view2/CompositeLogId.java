package com.yandex.div.core.view2;

import bk.a;
import ck.p;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: CompositeLogId.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CompositeLogId {
    private final String actionLogId;
    private final g compositeLogId$delegate = b.a(new a<String>() { // from class: com.yandex.div.core.view2.CompositeLogId$compositeLogId$2
        {
            super(0);
        }

        @Override // bk.a
        public final String invoke() {
            return this.this$0.formatCompositeLogId();
        }
    });
    private final String dataTag;
    private final String scopeLogId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeLogId)) {
            return false;
        }
        CompositeLogId compositeLogId = (CompositeLogId) obj;
        return p.e(this.dataTag, compositeLogId.dataTag) && p.e(this.scopeLogId, compositeLogId.scopeLogId) && p.e(this.actionLogId, compositeLogId.actionLogId);
    }

    public int hashCode() {
        return (((this.dataTag.hashCode() * 31) + this.scopeLogId.hashCode()) * 31) + this.actionLogId.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCompositeLogId() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.dataTag);
        if (this.scopeLogId.length() > 0) {
            str = '#' + this.scopeLogId;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.actionLogId);
        return sb2.toString();
    }

    private final String getCompositeLogId() {
        return (String) this.compositeLogId$delegate.getValue();
    }

    public CompositeLogId(String str, String str2, String str3) {
        this.dataTag = str;
        this.scopeLogId = str2;
        this.actionLogId = str3;
    }

    public String toString() {
        return getCompositeLogId();
    }
}
