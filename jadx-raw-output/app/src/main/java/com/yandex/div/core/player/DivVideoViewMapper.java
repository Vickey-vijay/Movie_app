package com.yandex.div.core.player;

import ck.p;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div2.DivVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import nj.b0;

/* JADX INFO: compiled from: DivVideoViewMapper.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivVideoViewMapper {
    private final WeakHashMap<DivVideoView, DivVideo> currentViews = new WeakHashMap<>();

    public final void addView(DivVideoView divVideoView, DivVideo divVideo) {
        this.currentViews.put(divVideoView, divVideo);
    }

    public final DivPlayer getPlayer(DivVideo divVideo) {
        Set<Map.Entry<DivVideoView, DivVideo>> setEntrySet = this.currentViews.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (p.e(entry.getValue(), divVideo) || p.e(((DivVideo) entry.getValue()).getId(), divVideo.getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DivPlayerView playerView = ((DivVideoView) ((Map.Entry) it.next()).getKey()).getPlayerView();
            DivPlayer attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
            if (attachedPlayer != null) {
                arrayList2.add(attachedPlayer);
            }
        }
        return (DivPlayer) b0.h0(arrayList2);
    }
}
