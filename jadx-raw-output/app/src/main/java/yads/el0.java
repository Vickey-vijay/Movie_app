package yads;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class el0 extends fz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nl0 f77130m;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // yads.fz2
    public final yads.r43 a(byte[] r47, int r48, boolean r49) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.el0.a(byte[], int, boolean):yads.r43");
    }

    public el0(List list) {
        jb2 jb2Var = new jb2((byte[]) list.get(0));
        this.f77130m = new nl0(jb2Var.r(), jb2Var.r());
    }
}
