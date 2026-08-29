package org.matsim.dashboard;


import org.matsim.analysis.postAnalysis.drt.DrtPostProcessingAverageAnalysis;
import org.matsim.application.analysis.population.TripAnalysis;
import org.matsim.simwrapper.Dashboard;
import org.matsim.simwrapper.Data;
import org.matsim.simwrapper.Header;
import org.matsim.simwrapper.Layout;
import org.matsim.simwrapper.viz.Hexagons;
import org.matsim.simwrapper.viz.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * new output trips xy hexagon dashboard.
 */
public class OutputTripsDashboard implements Dashboard {

	@Override
	public void configure(Header header, Layout layout) {
		header.title = "Output Trips";
		layout.row("Output_Trips")
			.el( Hexagons.class, ( viz, data) -> {
				viz.title = "Output Trips";
				viz.file = "*output_trips.csv.gz";
				viz.projection	= "EPSG:25832";

				viz.addAggregation(
					"Aggregation Title",
					"Orig",
					"start_x",
					"start_y",
					"Dest",
					"end_x",
					"end_y"
					);
			});
	}
}
