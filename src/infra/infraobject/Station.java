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
package infra.infraobject;

import infra.InfraDatas;
import infra.type.*;
import java.util.*;

/**
 *
 * @author soobin Jeon <j.soobin@gmail.com>, chungsan Lee <dj.zlee@gmail.com>,
 * youngtak Han <gksdudxkr@gmail.com>
 */
public class Station extends RNode{
    //Station Type(VDS Zone Type CODE)
    private StationType stationtype = StationType.NONE;
    //Node Order
    private int order = -1;
    //Start Location from Start Point
    protected double Start_Loc = -1;
    //End Location from Start Point
    protected double End_Loc = -1;
    //Length
    private int Length = -1;
    //roadType
    protected String roadType = null;
    //lane
    private int lane = -1;
    //speedLimit
    protected float speedLimit;
    
    //Detectors must include the Mainline, Bus lane and so on
    private List<Detector> detectors = new ArrayList<Detector>();
    
    public Station(HashMap<InfraDatas,Object> datas) {
        super(datas,RnodeType.STATION);
        Integer it;
        Double dt;
        
        it = (Integer)super.getProperty(InfraDatas.ORDER);
        order = it == null ? -1 : it;
        
        it = (Integer)super.getProperty(InfraDatas.LENGTH);
        Length = it == null ? -1 : it;
        
        dt = (Double)super.getProperty(InfraDatas.START_LOC);
        Start_Loc = dt == null ? -1 : dt;
        
        dt = (Double)super.getProperty(InfraDatas.END_LOC);
        End_Loc = dt == null ? -1 : dt;
    }
    
    
}
