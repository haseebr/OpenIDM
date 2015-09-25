package org.forgerock.openidm.managed;

import org.forgerock.json.JsonValue;
import org.forgerock.json.resource.Request;
import org.forgerock.json.resource.ResourceException;
import org.forgerock.openidm.sync.impl.SynchronizationService;
import org.forgerock.services.context.Context;

/**
 * An interface for performing sync events on managed objects.
 */
public interface ManagedObjectSyncService {

    /**
     * Sends a sync action request to the synchronization service
     *
     * @param context the Context of the request
     * @param request the Request being processed
     * @param resourceId the additional resourceId parameter telling the synchronization service which object
     *                   is being synchronized
     * @param action the {@link org.forgerock.openidm.sync.impl.SynchronizationService.SyncServiceAction}
     * @param oldValue the previous object value before the change (if applicable, or null if not)
     * @param newValue the object value to sync
     * @throws ResourceException in case of a failure that was not handled by the ResultHandler
     */
    public void performSyncAction(final Context context, final Request request, final String resourceId,
            final SynchronizationService.SyncServiceAction action, final JsonValue oldValue, final JsonValue newValue)
        throws ResourceException;
}
