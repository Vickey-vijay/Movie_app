package org.fourthline.cling.support.renderingcontrol;

/* JADX INFO: loaded from: classes3.dex */
public enum RenderingControlErrorCode {
    INVALID_PRESET_NAME(701, "The specified name is not a valid preset name"),
    INVALID_INSTANCE_ID(702, "The specified instanceID is invalid for this RenderingControl");

    private int code;
    private String description;

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    RenderingControlErrorCode(int i10, String str) {
        this.code = i10;
        this.description = str;
    }

    public static RenderingControlErrorCode getByCode(int i10) {
        for (RenderingControlErrorCode renderingControlErrorCode : values()) {
            if (renderingControlErrorCode.getCode() == i10) {
                return renderingControlErrorCode;
            }
        }
        return null;
    }
}
