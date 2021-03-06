/*
 * Copyright 2006-2009, 2017, 2020 United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 * 
 * The NASA World Wind Java (WWJ) platform is licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * NASA World Wind Java (WWJ) also contains the following 3rd party Open Source
 * software:
 * 
 *     Jackson Parser – Licensed under Apache 2.0
 *     GDAL – Licensed under MIT
 *     JOGL – Licensed under  Berkeley Software Distribution (BSD)
 *     Gluegen – Licensed under Berkeley Software Distribution (BSD)
 * 
 * A complete listing of 3rd Party software notices and licenses included in
 * NASA World Wind Java (WWJ)  can be found in the WorldWindJava-v2.2 3rd-party
 * notices and licenses PDF found in code directory.
 */
package gov.nasa.worldwindx.applications.sar;

import gov.nasa.worldwind.geom.*;

/**
 * @author tag
 * @version $Id: SARPosition.java 1171 2013-02-11 21:45:02Z dcollins $
 */
public class SARPosition extends Position
{
    public static class Info
    {
        private final String author;
        private final long editTime;
        private final String comment;

        public Info(String author, long editTime, String comment)
        {
            this.author = author;
            this.editTime = editTime;
            this.comment = comment;
        }
    }

    private Info info;

    public SARPosition()
    {
        super(Angle.ZERO, Angle.ZERO, 0d);
    }

    public SARPosition(Angle latitude, Angle longitude, double elevation)
    {
        super(latitude, longitude, elevation);
    }

    public SARPosition(Position pos)
    {
        super(pos.getLatitude(), pos.getLongitude(), pos.getElevation());
    }
}
