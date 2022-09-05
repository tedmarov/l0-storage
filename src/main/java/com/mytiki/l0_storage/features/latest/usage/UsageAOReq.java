/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.l0_storage.features.latest.usage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UsageAOReq {
    private String path;
    private long sizeBytes;

    @JsonCreator
    public UsageAOReq(
            @JsonProperty(required = true) String path,
            @JsonProperty(required = true) long sizeBytes) {
        this.path = path;
        this.sizeBytes = sizeBytes;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }
}
