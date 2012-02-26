/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010, 2011, 2012 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.version;

/**
 * Encapsulation of bindings current version information.
 */
public class VlcjVersion {

    /**
     * Run-time version of vlcj.
     */
    private static final Version VERSION = new Version("2.1.0");

    /**
     * Get the run-time version.
     * 
     * @return vlcj version
     */
    public static final Version getVersion() {
        return VERSION;
    }
}