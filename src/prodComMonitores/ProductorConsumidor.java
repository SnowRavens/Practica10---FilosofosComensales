package prodComMonitores;

class ProductorConsumidor {
	public static void main(String args[]) {
		BufferLimitadoMonitor buffer = new BufferLimitadoMonitor();
		Productor productor = new Productor( buffer );
		Consumidor consumidor = new Consumidor( buffer );
	}
}