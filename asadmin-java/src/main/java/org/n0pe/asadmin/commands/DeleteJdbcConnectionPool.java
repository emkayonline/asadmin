/**
 * asadmin-glassfish-plugin : a maven plugin for glassfish administratives tasks
 *
 * Copyright (C) 2008  Paul Merlin
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
package org.n0pe.asadmin.commands;

import org.n0pe.asadmin.AbstractAsAdminCmd;

/**
 * DeleteJdbcConnectionPool.
 *
 * @author Christophe SOUVIGNIER <chris.so@free.fr>
 */
public class DeleteJdbcConnectionPool extends  AbstractAsAdminCmd {

    public static final String JDBC = "delete-jdbc-connection-pool";
    private String poolName;

    private DeleteJdbcConnectionPool() {
    }

    public DeleteJdbcConnectionPool(String poolName) {
        this.poolName = poolName;
    }

    public boolean needCredentials() {
        return true;
    }

    public String getActionCommand() {
        if (poolName == null) {
            throw new IllegalStateException();
        }
        return JDBC;
    }

    public String[] getParameters() {
        return new String[]{poolName};
    }
}
