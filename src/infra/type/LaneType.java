/*
 * Copyright (C) 2015 Software&System Lab. Kangwon National University.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package infra.type;

/**
 *
 * @author soobin Jeon <j.soobin@gmail.com>, chungsan Lee <dj.zlee@gmail.com>,
 * youngtak Han <gksdudxkr@gmail.com>
 */
public enum LaneType {
    None(" ","","",-1),
    All("All Lane","","",0),
    MAINLINE("Mainline","M","DM",1),
    BUS("Bus","B","DB",2),
    MERGE("Merge","M","DM",3),
    AUXILARY("Auxiliary","A","DA",4),
    RAMP("Ramp","R","DR",5),
    HOV("HOV","H","DH",6),
    QUEUE("Queue","Q","DQ",7),
    PASSAGE("Passage","P","DP",8),
    SHOULDER("Shoulder","S","DS",9);
    
    
    
    private LaneType(String d, String s, String dbs, int _code){
        desc = d;
        suffix = s;
        dbsuffix = dbs;
        code = _code;
    }
    
    public final String desc;
    
    public final String suffix;
    
    public final int code;
    
    public final String dbsuffix;
    
    public String toString(){
        return desc;
    }
    
    public static LaneType get(String name){
        for(LaneType tt : LaneType.values()){
            if(name.equals(tt.name())) return tt;
        }
        return None;
    }
    
    public boolean isAll(){
        return (this == All);
    }
    
    public boolean isMainline(){
        return (this == MAINLINE);
    }
    
    public boolean isBus(){
        return this==BUS;
    }
    
    public boolean isMerge(){
        return this==MERGE;
    }
    
    public boolean isAux(){
        return this==AUXILARY;
    }
    
    public boolean isRamp(){
        return  this == RAMP ||
                this == QUEUE ||
                this == PASSAGE;
    }
    
    public boolean isQueue(){
        return this == QUEUE;
    }
    
    public boolean isPassage(){
        return this ==PASSAGE;
    }
}
