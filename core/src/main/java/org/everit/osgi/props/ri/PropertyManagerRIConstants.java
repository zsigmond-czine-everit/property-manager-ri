/**
 * This file is part of Everit - Property Manager RI.
 *
 * Everit - Property Manager RI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Property Manager RI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Property Manager RI.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.props.ri;

public final class PropertyManagerRIConstants {

    public static final String PROP_CACHECONFIGURATION_TARGET = "cacheConfiguration.target";
    public static final String PROP_CACHEFACTORY_TARGET = "cacheFactory.target";
    public static final String PROP_DATASOURCE_TARGET = "dataSource.target";
    public static final String PROP_SQLTEMPLATES_TARGET = "sqlTemplates.target";
    public static final String PROP_TRANSACTION_HELPER_TARGET = "th.target";
    public static final String SERVICE_FACTORY_PID_PROPERTY_MANAGER = "org.everit.osgi.props.ri.PropertyManager";

    private PropertyManagerRIConstants() {
    }
}
