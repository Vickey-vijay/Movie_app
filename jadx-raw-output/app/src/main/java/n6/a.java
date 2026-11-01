package n6;

import java.util.List;

/* JADX INFO: compiled from: BitArrayBuilder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static c6.a a(List<b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).c() == null) {
            size--;
        }
        c6.a aVar = new c6.a(size * 12);
        int i10 = 0;
        int iB = list.get(0).c().b();
        for (int i11 = 11; i11 >= 0; i11--) {
            if (((1 << i11) & iB) != 0) {
                aVar.q(i10);
            }
            i10++;
        }
        for (int i12 = 1; i12 < list.size(); i12++) {
            b bVar = list.get(i12);
            int iB2 = bVar.b().b();
            for (int i13 = 11; i13 >= 0; i13--) {
                if (((1 << i13) & iB2) != 0) {
                    aVar.q(i10);
                }
                i10++;
            }
            if (bVar.c() != null) {
                int iB3 = bVar.c().b();
                for (int i14 = 11; i14 >= 0; i14--) {
                    if (((1 << i14) & iB3) != 0) {
                        aVar.q(i10);
                    }
                    i10++;
                }
            }
        }
        return aVar;
    }
}
