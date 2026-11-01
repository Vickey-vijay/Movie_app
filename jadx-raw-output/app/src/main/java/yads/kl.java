package yads;

import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class kl extends n53 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f79443e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79446d;

    public final boolean a(jb2 jb2Var) throws m53 {
        if (this.f79444b) {
            jb2Var.e(jb2Var.f78967b + 1);
        } else {
            int iM = jb2Var.m();
            int i10 = (iM >> 4) & 15;
            this.f79446d = i10;
            if (i10 == 2) {
                int i11 = f79443e[(iM >> 2) & 3];
                lx0 lx0Var = new lx0();
                lx0Var.f79967k = "audio/mpeg";
                lx0Var.f79980x = 1;
                lx0Var.f79981y = i11;
                this.f80565a.a(new mx0(lx0Var));
                this.f79445c = true;
            } else if (i10 == 7 || i10 == 8) {
                String str = i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                lx0 lx0Var2 = new lx0();
                lx0Var2.f79967k = str;
                lx0Var2.f79980x = 1;
                lx0Var2.f79981y = 8000;
                this.f80565a.a(new mx0(lx0Var2));
                this.f79445c = true;
            } else if (i10 != 10) {
                throw new m53("Audio format not supported: " + this.f79446d);
            }
            this.f79444b = true;
        }
        return true;
    }

    public kl(m73 m73Var) {
        super(m73Var);
    }

    public final boolean a(long j10, jb2 jb2Var) throws ob2 {
        if (this.f79446d == 2) {
            int i10 = jb2Var.f78968c - jb2Var.f78967b;
            this.f80565a.a(i10, jb2Var);
            this.f80565a.a(j10, 1, i10, 0, null);
            return true;
        }
        int iM = jb2Var.m();
        if (iM == 0 && !this.f79445c) {
            int i11 = jb2Var.f78968c - jb2Var.f78967b;
            byte[] bArr = new byte[i11];
            jb2Var.a(bArr, 0, i11);
            a aVarA = b.a(new ib2(i11, bArr), false);
            lx0 lx0Var = new lx0();
            lx0Var.f79967k = "audio/mp4a-latm";
            lx0Var.f79964h = aVarA.f75343c;
            lx0Var.f79980x = aVarA.f75342b;
            lx0Var.f79981y = aVarA.f75341a;
            lx0Var.f79969m = Collections.singletonList(bArr);
            this.f80565a.a(new mx0(lx0Var));
            this.f79445c = true;
            return false;
        }
        if (this.f79446d == 10 && iM != 1) {
            return false;
        }
        int i12 = jb2Var.f78968c - jb2Var.f78967b;
        this.f80565a.a(i12, jb2Var);
        this.f80565a.a(j10, 1, i12, 0, null);
        return true;
    }
}
