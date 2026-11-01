package com.mbridge.msdk.config.component.common.express.node;

/* JADX INFO: compiled from: ValueNode.java */
/* JADX INFO: loaded from: classes11.dex */
public class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33026a;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objSubstring;
        if (this.f33026a.startsWith("$")) {
            objSubstring = com.mbridge.msdk.config.component.common.express.c.a(this.f33026a, aVar);
        } else if (this.f33026a.startsWith("\\") && this.f33026a.endsWith("\\\"")) {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f33026a;
            sb2.append(str.substring(1, str.length() - 2));
            sb2.append("\"");
            objSubstring = sb2.toString();
        } else if (this.f33026a.startsWith("\"") && this.f33026a.endsWith("\"")) {
            String str2 = this.f33026a;
            objSubstring = str2.substring(1, str2.length() - 1);
        } else {
            objSubstring = this.f33026a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return objSubstring;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.f33026a.substring(1));
        return aVar2;
    }

    public i(String str) {
        this.f33026a = str;
    }
}
