import React from 'react';

export default function Formulario() {
    return (
<footer className="bg-gray-100 text-gray-600 text-sm py-6 mt-12 border-t">
  <div className="max-w-7xl mx-auto px-4 flex flex-col md:flex-row justify-between items-center space-y-4 md:space-y-0">
    <p>&copy; 2025 Hospital Universiário. Todos os direitos reservados.</p>
    <div className="flex space-x-4">
      <a href="/sobre" className="hover:underline">Sobre</a>
      <a href="/privacidade" className="hover:underline">Privacidade</a>
    </div>
  </div>
</footer>
    );
}