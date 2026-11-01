package org.fourthline.cling.model.types;

/* JADX INFO: loaded from: classes11.dex */
public enum NotificationSubtype {
    ALIVE("ssdp:alive"),
    UPDATE("ssdp:update"),
    BYEBYE("ssdp:byebye"),
    ALL("ssdp:all"),
    DISCOVER("ssdp:discover"),
    PROPCHANGE("upnp:propchange");

    private String headerString;

    public String getHeaderString() {
        return this.headerString;
    }

    NotificationSubtype(String str) {
        this.headerString = str;
    }
}
