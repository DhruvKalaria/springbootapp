package com.boot;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by dhruvkalaria on 8/13/17.
 */
public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController shipwreckController;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetShipwrecks() {
        Shipwreck sw = new Shipwreck();
        sw.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(sw);

        Shipwreck shipwreck = shipwreckController.get(1L);
        assertEquals(1L,shipwreck.getId().longValue());
    }

    @Test
    public void testCreateShipwrecks() {
        Shipwreck sw = new Shipwreck();
        sw.setId(1L);
        when(shipwreckRepository.saveAndFlush(sw)).thenReturn(sw);

        Shipwreck shipwreck = shipwreckController.create(sw);
        //assertEquals(1L,shipwreck.getId().longValue());

        assertThat(shipwreck.getId(), is(1L));
    }
}
