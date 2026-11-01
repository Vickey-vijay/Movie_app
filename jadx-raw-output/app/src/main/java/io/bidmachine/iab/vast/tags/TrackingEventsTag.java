package io.bidmachine.iab.vast.tags;

import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
class TrackingEventsTag extends VastXmlTag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumMap f59685c;

    public TrackingEventsTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TrackingEvent trackingEventValueOf;
        super(xmlPullParser);
        this.f59685c = new EnumMap(TrackingEvent.class);
        xmlPullParser.require(2, null, VastTagName.TRACKING_EVENTS);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), VastTagName.TRACKING)) {
                    String strA = new TrackingTag(xmlPullParser).a("event");
                    try {
                        trackingEventValueOf = TrackingEvent.valueOf(strA);
                    } catch (Exception unused) {
                        VastLog.d("VastXmlTag", "Event: %s is not valid. Skipping it.", strA);
                        trackingEventValueOf = null;
                    }
                    if (trackingEventValueOf != null) {
                        String strC = VastXmlTag.c(xmlPullParser);
                        List list = (List) this.f59685c.get(trackingEventValueOf);
                        if (list != null) {
                            list.add(strC);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(strC);
                            this.f59685c.put(trackingEventValueOf, arrayList);
                        }
                    }
                }
                VastXmlTag.d(xmlPullParser);
            }
        }
        xmlPullParser.require(3, null, VastTagName.TRACKING_EVENTS);
    }

    public EnumMap a() {
        return this.f59685c;
    }
}
