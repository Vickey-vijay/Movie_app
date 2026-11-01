package com.mgs.carparking.netbean;

/* JADX INFO: compiled from: UpdateEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class UpdateEvent {
    private int code;
    private String message;
    private UpdateData result;

    /* JADX INFO: compiled from: UpdateEvent.kt */
    public final class UpdateData {
        private String channel_code;
        private int force_upgrade;
        private String google_id;
        private String packagesize;
        private String sys_platform;
        private String text;
        private String url;
        private int version;
        private String version_name;

        public UpdateData() {
        }

        public final String getChannel_code() {
            return this.channel_code;
        }

        public final int getForce_upgrade() {
            return this.force_upgrade;
        }

        public final String getGoogle_id() {
            return this.google_id;
        }

        public final String getPackagesize() {
            return this.packagesize;
        }

        public final String getSys_platform() {
            return this.sys_platform;
        }

        public final String getText() {
            return this.text;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getVersion() {
            return this.version;
        }

        public final String getVersion_name() {
            return this.version_name;
        }

        public final void setChannel_code(String str) {
            this.channel_code = str;
        }

        public final void setForce_upgrade(int i10) {
            this.force_upgrade = i10;
        }

        public final void setGoogle_id(String str) {
            this.google_id = str;
        }

        public final void setPackagesize(String str) {
            this.packagesize = str;
        }

        public final void setSys_platform(String str) {
            this.sys_platform = str;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setUrl(String str) {
            this.url = str;
        }

        public final void setVersion(int i10) {
            this.version = i10;
        }

        public final void setVersion_name(String str) {
            this.version_name = str;
        }
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final UpdateData getResult() {
        return this.result;
    }

    public final void setCode(int i10) {
        this.code = i10;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setResult(UpdateData updateData) {
        this.result = updateData;
    }
}
