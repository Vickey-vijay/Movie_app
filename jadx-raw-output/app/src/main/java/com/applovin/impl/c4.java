package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f7121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f7122e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque f7123f = new ArrayDeque();

    public Long a() {
        return this.f7121d;
    }

    public Deque b() {
        return this.f7123f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f7120c <= 0) {
            return;
        }
        Map map = (Map) this.f7122e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                long jLongValue = 0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / ((long) list.size())));
            }
        }
        if (this.f7123f.size() == this.f7120c) {
            this.f7123f.pollLast();
        }
        this.f7123f.addFirst(map2);
    }

    public void b(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f7119b) && this.f7120c > 0) {
            for (String str3 : this.f7119b) {
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j10, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f7118a) && str.endsWith(this.f7118a)) {
            this.f7121d = Long.valueOf(j10);
        }
    }

    public c4(com.applovin.impl.sdk.k kVar) {
        this.f7118a = (String) kVar.a(x4.f10050u4);
        this.f7119b = kVar.c(x4.f10058v4);
        this.f7120c = ((Integer) kVar.a(x4.f10066w4)).intValue();
    }

    private void a(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f7122e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f7122e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j10));
    }
}
