#!/bin/bash

data=`cat event-1.json`

x=1
while [ $x -le 10000 ]
	do
    		echo "request: #$x"
   		echo `curl -X POST -d "$data" -s -w '\n\n time taken: %{time_total}s\n' https://<host>/<function-name>`
		if [ $(($x%100)) -eq 0 ]; then
	   		echo "sleeping..."
			sleep 0.05
   		fi
    		x=$(($x+1))
  	done
