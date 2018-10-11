package com.example.android.roomwordssample;

/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * A basic class representing an entity that is a row in a one-column database table.
 *
 * @ Entity - You must annotate the class as an entity and supply a table name if not class name.
 * @ PrimaryKey - You must identify the primary key.
 * @ ColumnInfo - You must supply the column name if it is different from the variable name.
 *
 * See the documentation for the full rich set of annotations.
 * https://developer.android.com/topic/libraries/architecture/room.html
 */

@Entity(tableName = "word_table")
public class Word {
    @NonNull
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    private int mid;



    @NonNull
    @ColumnInfo(name = "title")
    private String mtitle;

    @NonNull
    @ColumnInfo(name = "time")
    private String mtime;

    @NonNull
    @ColumnInfo(name = "date")
    private String mdate;

    @NonNull
    @ColumnInfo(name = "repeat")
    private String mrepeat;

    @NonNull
    @ColumnInfo(name = "repeat_no")
    private String mrepeat_no;

    @NonNull
    @ColumnInfo(name = "repeat_type")
    private String mrepeat_type;

    public Word(@NonNull String mtitle,
                @NonNull String mtime,
                @NonNull String mdate,
                @NonNull String mrepeat,
                @NonNull String mrepeat_no,
                @NonNull String mrepeat_type) {
        this.mtitle = mtitle;
        this.mtime = mtime;
        this.mdate = mdate;
        this.mrepeat = mrepeat;
        this.mrepeat_no = mrepeat_no;
        this.mrepeat_type = mrepeat_type;
    }


    //    public Word(
//             @NonNull String title,
//             @NonNull String time,
//             @NonNull String date,
//             @NonNull String repeat,
//             @NonNull String repeat_no,
//             @NonNull String repeat_type) {
//
//        this.mtitle = title;
//        this.mtime=time;
//        this.mdate=date;
//        this.mrepeat=repeat;
//        this.mrepeat_no=repeat_no;
//        this.mrepeat_type=repeat_type;
//    }
    @NonNull
    public int getMid() {
        return this.mid;
    }

    public void setMid(@NonNull int mid) {
        this.mid = mid;
    }



    @NonNull
    public String getMtitle() {
        return this.mtitle;
    }

    public void setMtitle(@NonNull String mtitle) {
        this.mtitle = mtitle;
    }

    @NonNull
    public String getMtime() {
        return this.mtime;
    }

    public void setMtime(@NonNull String mtime) {
        this.mtime = mtime;
    }

    @NonNull
    public String getMdate() {
        return this.mdate;
    }

    public void setMdate(@NonNull String mdate) {
        this.mdate = mdate;
    }

    @NonNull
    public String getMrepeat() {
        return this.mrepeat;
    }

    public void setMrepeat(@NonNull String mrepeat) {
        this.mrepeat = mrepeat;
    }

    @NonNull
    public String getMrepeat_no() {
        return this.mrepeat_no;
    }

    public void setMrepeat_no(@NonNull String mrepeat_no) {
        this.mrepeat_no = mrepeat_no;
    }

    @NonNull
    public String getMrepeat_type() {
        return this.mrepeat_type;
    }

    public void setMrepeat_type(@NonNull String mrepeat_type) {
        this.mrepeat_type = mrepeat_type;
    }



}