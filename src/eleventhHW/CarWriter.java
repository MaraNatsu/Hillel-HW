package eleventhHW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import eleventhHW.vehicles.Car;
import eleventhHW.vehicles.Lorry;
import eleventhHW.vehicles.PassengerCar;
import eleventhHW.vehicles.Vehicle;

public class CarWriter {
  private String path = "./cars.txt";
  private FileInputStream fin;
  private FileOutputStream fout;

  public void write(Vehicle[] vehicles) {
    try {
      fout = new FileOutputStream(path);

      String writeText = "";
      for (int i = 0; i < vehicles.length; i++) {
        writeText += vehicles[i].getFileView() + '\n';
      }

      fout.write(writeText.getBytes());
    } catch (FileNotFoundException err) {
    } catch (IOException err) {
    }
  }

  public Vehicle[] read() {
    String text = "";
    try {
      fin = new FileInputStream(path);
      byte[] characters = fin.readAllBytes();
      text = new String(characters);
    } catch (FileNotFoundException err) {
    } catch (IOException err) {
    }

    Vehicle[] vehicles = new Vehicle[0];
    String[] lines = text.split("\n");
    for (int i = 0; i < lines.length; i++) {
      String[] data = lines[i].split(",");
      String type = data[data.length - 1];
      Vehicle vehicle;
      switch (type) {
        case "car":
          vehicle = new Car(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]), data[4]);
          break;

        case "lorry":
          vehicle = new Lorry(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]), Double.parseDouble(data[4]));
          break;

        case "passengerCar":
          vehicle = new PassengerCar(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]), Integer.parseInt(data[4]));
          break;

        default:
          continue;
      }
      vehicles = addToVehicles(vehicles, vehicle);
    }

    return vehicles;
  }

  private Vehicle[] addToVehicles(Vehicle[] vehicles, Vehicle vehicle) {
    Vehicle[] newArray = new Vehicle[vehicles.length + 1];
    copy(newArray, vehicles);
    newArray[newArray.length - 1] = vehicle;
    return newArray;
  }

  private void copy(Vehicle[] to, Vehicle[] from) {
    for (int i = 0; i < from.length; i++) {
      to[i] = from[i];
    }
  }
}
