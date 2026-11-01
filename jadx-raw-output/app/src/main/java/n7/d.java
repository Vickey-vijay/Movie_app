package n7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w7.f;

/* JADX INFO: compiled from: RedirectHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class d {
    public static boolean b(int i10) {
        return i10 == 301 || i10 == 302 || i10 == 303 || i10 == 300 || i10 == 307 || i10 == 308;
    }

    public static b a(Map<String, List<String>> map, String str) throws IOException {
        b bVarA = p7.a.j().a(str);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    bVarA.c(key, it.next());
                }
            }
        }
        return bVarA;
    }

    public static b c(Map<String, List<String>> map, b bVar, List<String> list) throws IllegalAccessException, IOException {
        int responseCode = bVar.getResponseCode();
        String strG = bVar.g("Location");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (b(responseCode)) {
            if (strG != null) {
                if (w7.d.f73535a) {
                    w7.d.a(d.class, "redirect to %s with %d, %s", strG, Integer.valueOf(responseCode), arrayList);
                }
                bVar.a();
                bVar = a(map, strG);
                arrayList.add(strG);
                bVar.execute();
                responseCode = bVar.getResponseCode();
                strG = bVar.g("Location");
                i10++;
                if (i10 >= 10) {
                    throw new IllegalAccessException(f.o("redirect too many times! %s", arrayList));
                }
            } else {
                throw new IllegalAccessException(f.o("receive %d (redirect) but the location is null with response [%s]", Integer.valueOf(responseCode), bVar.e()));
            }
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return bVar;
    }
}
