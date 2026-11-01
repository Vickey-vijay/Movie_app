package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class on3 {
    public static boolean a(ld0 ld0Var) {
        jb2 jb2Var = new jb2(8);
        int i10 = nn3.a(ld0Var, jb2Var).f80715a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        ld0Var.b(jb2Var.f78966a, 0, 4, false);
        jb2Var.e(0);
        int iB = jb2Var.b();
        if (iB == 1463899717) {
            return true;
        }
        ih1.b("WavHeaderReader", "Unsupported form type: " + iB);
        return false;
    }

    public static nn3 a(int i10, ld0 ld0Var, jb2 jb2Var) throws ob2, EOFException, InterruptedIOException {
        nn3 nn3VarA = nn3.a(ld0Var, jb2Var);
        while (nn3VarA.f80715a != i10) {
            ih1.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + nn3VarA.f80715a);
            long j10 = nn3VarA.f80716b + 8;
            if (j10 <= 2147483647L) {
                ld0Var.a((int) j10);
                nn3VarA = nn3.a(ld0Var, jb2Var);
            } else {
                throw ob2.b("Chunk is too large (~2GB+) to skip; id: " + nn3VarA.f80715a);
            }
        }
        return nn3VarA;
    }
}
